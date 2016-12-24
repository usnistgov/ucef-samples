#ifndef MAIN_HPP
#define MAIN_HPP

#include "GridlabDFederateBase.hpp"

// Needed for Fork/exec/kill
#include <sys/types.h>
#include <unistd.h>
#include <signal.h>

// Needed for communicating with GLD
#include <boost/network/protocol/http/client.hpp>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include "rapidxml.hpp"
#include "rapidxml_utils.hpp"

struct gld_obj
{
  bool has_data;
  std::string type;
  std::string object;
  std::string name;
  std::string value;
};

class GridlabDFederate : public GridlabDFederateBase 
{
private:
  double _currentTime;
  std::string _gld_ip;
  std::string _gld_port;
public:
  typedef GridlabDFederateBase Super;
  GridlabDFederate( int argc, char *argv[] ) 
    : Super( argc, argv ), _currentTime( 0 ), _gld_ip("localhost"), _gld_port("6267") { }
  virtual ~ GridlabDFederate( void )
    throw (RTI::FederateInternalError) { }

  class GridlabDFederateATRCallback : public ATRCallback 
  {
  private:
    GridlabDFederate &_gldfed;
  public:
    GridlabDFederateATRCallback( GridlabDFederate &gldfed ) : _gldfed( gldfed ) { }
    virtual void execute( void ) { _gldfed.execute(); }
    virtual SP clone( void ) { return SP( new GridlabDFederateATRCallback( *this ) ); }
  };

  void initialize( void );
  void execute( void );
  
  bool call_gld( std::string gld_url, gld_obj& ret_obj );
};

#endif
