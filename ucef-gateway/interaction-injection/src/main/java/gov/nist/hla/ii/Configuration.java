package gov.nist.hla.ii;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.ii.exception.PropertyNotAssigned;
import gov.nist.hla.ii.exception.PropertyNotFound;

public class Configuration {
  private static final Logger logger = LogManager.getLogger();
  
  private Properties properties = new Properties();
  
  public Configuration(String filename)
      throws FileNotFoundException,
             IOException {
    InputStream input = null;
    try {
      logger.info("reading input file " + filename);
      input = Configuration.class.getClassLoader().getResourceAsStream(filename);      
      logger.info("loading properties");
      properties.load(input);
    } finally {
      if (input != null) {
        try {
          input.close();
        } catch (IOException e) {
          logger.warn("exception when closing resource", e);
        }
      }
    }
  }
  
  public String getRequiredProperty(String key)
      throws PropertyNotFound,
             PropertyNotAssigned {
    String value = properties.getProperty(key);
    if (value == null) {
      throw new PropertyNotFound("property does not exist: " + key);
    }
    if (value.isEmpty()) {
      throw new PropertyNotAssigned("property not assigned a value: " + key);
    }
    return value;
  }
  
  public Double getRequiredPropertyAsDouble(String key)
      throws PropertyNotFound,
             PropertyNotAssigned {
    String value = getRequiredProperty(key);
    try {
      return Double.parseDouble(value);
    } catch (NumberFormatException e) {
      logger.error("property cannot be parsed as Double: " +  key);
      throw e;
    }
  }
  
  public int getRequiredPropertyAsInteger(String key)
      throws PropertyNotFound,
             PropertyNotAssigned {
    String value = getRequiredProperty(key);
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      logger.error("property cannot be parsed as Integer: " +  key);
      throw e;
    }
  }
}
