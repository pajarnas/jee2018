package controller;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
   private Date date;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  
   
}
