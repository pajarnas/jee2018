package controller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.StuDAO;
import dao.StuDAOImp;

public class StuAction extends ActionSupport {
  List<String[]> stus;  
   public List<String[]> getStus() {
    return stus;
  }
  @Override public String execute() throws Exception{
     StuDAO dao=new StuDAOImp();
      stus=dao.getAllStus();
     return SUCCESS;
   }
}
