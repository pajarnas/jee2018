package demo;

import org.slf4j.*;

public class LogDemo {

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(LogDemo.class);
    logger.trace("log {}","trace");
    logger.debug("log {}","debug");
    logger.info("log {}","info");
    logger.warn("log {}","warn");
    logger.error("log {}","error"); 
  }
}
