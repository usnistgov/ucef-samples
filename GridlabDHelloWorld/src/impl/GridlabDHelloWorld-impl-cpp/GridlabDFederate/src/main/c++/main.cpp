#include "main.hpp"
#include <map>
#include <string>
#include <sstream>
//execute external process and read exactly binary or text output
//can read image from Zip file for example
std::string runProcess(const char* cmd){
  FILE* pipe = popen(cmd, "r");
  if (!pipe) return "ERROR";
  char buffer[262144];
  std::string data;
  std::string result;
  int dist=0;
  int size;
  //TIME_START
  while(!feof(pipe)) {
    size=(int)fread(buffer,1,262144, pipe); //cout<<buffer<<" size="<<size<<endl;
    data.resize(data.size()+size);
    memcpy(&data[dist],buffer,size);
    dist+=size;
  }
  //TIME_PRINT_
  pclose(pipe);
  return data;
}

void GridlabDFederate::initialize( void )
{
  GridlabDFederateATRCallback gldfedATRCb( *this );
  putAdvanceTimeRequest(  _currentTime, gldfedATRCb );

  readyToPopulate();
  readyToRun();
}

void GridlabDFederate::execute( void )
{
  // update class variables
  _currentTime += 1;

  // init temporary variables
  InteractionRoot::SP interactionRootSP;

  char tmpBuf[1024];
  std::string gld_url_base = "http://" + 
    _gld_ip + ":" + 
    _gld_port + "/";
  gld_obj object;
  int intf_retval = 0;
  std::string gld_url, date, time;

  // STEP GLD
  date = "2000-01-01 ";
  sprintf( tmpBuf,
	   "%02d:%02d:%02d",
	   (int)( ( (float)_currentTime / 60.0 ) / 60.0 ),
	   (int)( (float)_currentTime / 60.0 ),
	   (int)fmod((float)_currentTime, 60.0));
  time = std::string(tmpBuf);
  gld_url = gld_url_base + "control/pauseat=" + date + time;
  std::cout << 
    "GLDFederate: Stepping GLD to " <<
    date + time <<
    std::endl;

  std::string command = "wget '" + gld_url + "'";
  std::string text = runProcess(command.c_str());

  //intf_retval = call_gld(gld_url, object);
  
  std::map<std::string, std::string> alreadySentData;

  // GET MESSAGES HERE FROM HLA
  while ( (interactionRootSP = getNextInteraction() ) != 0 )
    {
      boost::shared_ptr<GridlabDInput> gldSP( boost::static_pointer_cast<GridlabDInput>( interactionRootSP ) );
      std::string objectName = gldSP->get_ObjectName();
      std::string parameterName = gldSP->get_Parameter();
      double value = gldSP->get_Value();
      std::string units = gldSP->get_Units();
      int operation = gldSP->get_Operation();
      
      // operation:
      //  0 : GET
      //  1 : SET
      //  ... : UNDEFINED

      // SEND DATA TO GLD; GET DATA FROM GLD
      std::stringstream ss;
      ss << value;
      std::string valueString = ss.str();
      if ( parameterName == "status" ) {
	if (value)
	  valueString = "CLOSED";
	else
	  valueString = "OPEN";
      }
      gld_url = gld_url_base + objectName + "/" + parameterName;
      if (operation == 1)
	gld_url += "=" + valueString + units;

      intf_retval = call_gld(gld_url, object);
      std::cout << "retval: " << intf_retval << ", has data: " << object.has_data << std::endl;
      if (intf_retval) // everything went well
	{
	  if (object.has_data)
	    {
	      if (operation == 0) // is this a GET operation? (defined above)
		{
		  std::string key = objectName + '/' + parameterName;
		  if (alreadySentData.find(key) == alreadySentData.end()) // haven't sent this data onto the bus before!
		    {
		      alreadySentData[key] = "sent";
		      GridlabDOutputSP output = create_GridlabDOutput();
		      output->set_ObjectName( object.object );
		      output->set_Parameter( object.name );
		      // need to split the value into value and units
		      std::cout << "GLDFederate: value: " << object.value << std::endl;
		      char *pEnd = 0;
		      value = strtod(object.value.c_str(), &pEnd);
		      output->set_Value( value );
		      output->set_Units( "" ); 
		      if (pEnd) {
			output->set_Units( std::string(pEnd) ); // there is always a space between the value and units
		      }
		      output->set_Operation( 0 ); // this is GLD output, operation is meaningless
		      std::cout <<
			"GLDFederate: Sending GridlabDOutput interaction: " << 
			output->get_ObjectName() << "/" << 
			output->get_Parameter() << ": " << 
			output->get_Value() << 
			output->get_Units() << ": " << 
			output->get_Operation() <<
			std::endl;
		      output->sendInteraction( getRTI(), _currentTime + getLookAhead() );
		    }
		}
	    }
	}
    }

  // Advance Time
  GridlabDFederateATRCallback gldfedATRcb( *this );
  putAdvanceTimeRequest( _currentTime, gldfedATRcb );
}

bool GridlabDFederate::call_gld(std::string gld_url,
				gld_obj& ret_obj)   // in-out param
{
  std::cout << "GLDFederate: calling into GLD: " << gld_url << std::endl;

  ret_obj.has_data = false;
  ret_obj.type = "";
  ret_obj.object = "";
  ret_obj.name = "";
  ret_obj.value = "";

  std::string command = "wget " + gld_url + " -q -O -";
  std::string text = runProcess(command.c_str());

  /*
  using namespace boost::network;
  http::client client;
  http::client::request request(gld_url);
  request << header("Connection", "close");
  http::client::response response = client.get(request);

  std::string text = body(response);
  */

  if (text.length() && text != "ERROR")
    {
      rapidxml::xml_document<> doc;
      doc.parse<0>((char *)text.c_str());

      rapidxml::xml_node<> *_type = doc.first_node("property");
      rapidxml::xml_node<> *_name, *_val, *_object;

      if (_type)
	{
	  _object = _type->first_node("object");
	  _name = _type->first_node("name");
	  _val = _type->first_node("value");

	  ret_obj.has_data = true;
	  ret_obj.type = "property";
	  ret_obj.object = _object->value();
	  ret_obj.name = _name->value();
	  ret_obj.value = _val->value();
	}
      else
	{
	  _type = doc.first_node("globalvar");
	  _name = _type->first_node("name");
	  _val = _type->first_node("value");

	  ret_obj.has_data = true;
	  ret_obj.type = "globalvar";
	  ret_obj.name = _name->value();
	  ret_obj.value = _val->value();
	}
    }
  return true;
}

int main(int argc, char** argv)
{
  pid_t pID = fork();
  if (pID == 0)
    {
      char *args[4];

      char process[] = "/usr/local/gridlab-d/bin/gridlabd";
      //char model[] = "/root/Projects/c2wt/examples/TES2016Demo/models/gridlab-d/model.glm";
      char model[] = "model.glm";
      char option[] = "--server";
      args[0] = process;
      args[1] = model;
      args[2] = option;
      args[3] = 0;

      execv(args[0], args);
    }

  std::cout << "Creating GridlabDFederate Object" << std::endl;
  GridlabDFederate gldfed( argc, argv );
  std::cout << "GridlabDFederate created" << std::endl;

  std::cout << "Initializing GridlabDFederate" << std::endl;
  gldfed.initialize();
  std::cout << "GridlabDFederate initialized" << std::endl;

  std::cout << "Running GridlabDFederate" << std::endl;
  gldfed.run();

  kill(0, SIGKILL);

  return 0;
}
