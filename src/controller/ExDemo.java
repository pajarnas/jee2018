package controller;

import java.io.IOException;
import java.sql.SQLException;

import org.slf4j.*;

import com.opensymphony.xwork2.ActionSupport;

public class ExDemo extends ActionSupport {
  final static Logger logger=LoggerFactory.getLogger(ExDemo.class);
  @Override public String execute()throws Exception{
    double d=Math.random();
    if(d>0.5){
      Exception ex=new IOException("io ex");
      logger.error(ex.getMessage());      
      throw ex;
    }
    else throw new SQLException("sql ex");
  }
}
