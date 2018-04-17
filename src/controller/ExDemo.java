package controller;

import java.io.IOException;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class ExDemo extends ActionSupport {
  @Override public String execute()throws Exception{
    double d=Math.random();
    if(d>0.5) throw new IOException("io ex");
    else throw new SQLException("sql ex");
  }
}
