package demo;

import org.slf4j.*;

public class LogDemo {
  private final static Logger logger = LoggerFactory.getLogger(LogDemo.class);
  public static void main(String[] args) {    
    logger.trace("log {}","trace");
    logger.debug("log {}","debug");
    logger.info("log {}","info");
    logger.warn("log {}","warn");
    logger.error("log {}","error"); 
    
  }
}
