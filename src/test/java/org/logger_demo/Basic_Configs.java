package org.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configs {
	

	static Logger log= Logger.getLogger(Basic_Configs.class);//	factory design pattern
	
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		
		
	}
	

}
