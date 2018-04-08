package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.StuDAO;
import dao.StuDAOImp;

public class LoginI18N extends ActionSupport {
  String pass;
  double java;
  public void setPass(String pass) {
    this.pass = pass;  
  }
  public String getPass() {
    return this.pass;
  }
  String username;
  public void setUsername(String _username) {
    this.username = _username;
  }
  public String getUsername() {
    return this.username;
  }
  public double getJava() {
    return java;
  }
  public void setJava(double java) {
    this.java = java;
  }
  String type;
  
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  @Override public void validate(){
    if(username.isEmpty()){
      addFieldError("username",getText("username.empty"));
    }
    if(pass.isEmpty()){
      addFieldError("pass",getText("pass.empty"));
    }
    if(java<0){
      addFieldError("java",getText("java.illegal",new String[]{""+java}));
    }
  }
  @Override public String execute() {
    if (username.equalsIgnoreCase("admin")) {     
      String msg=getText("stu.info",new String[]{username,""+java});
      System.out.println(msg);
      return type;
    } else {
      addActionError(getText("login.fail"));
      return "fail";
    }
  } 
}