package org.logger_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configs {
	
	static Logger log= Logger.getLogger(Property_Configs.class);
	
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		
		
		
		
		
		
		
		
	}

}
