package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Stu;

public class CheckLoginByObj extends ActionSupport {
  private Stu stu;

  public Stu getStu() {
    return stu;
  }

  public void setStu(Stu stu) {
    this.stu = stu;
    //null @todo ��֪Ϊ��
    System.out.println(this.stu.getUsername());
  }
  @Override public void validate(){
    if(stu.getUsername().isEmpty()){
      addFieldError("stu.username","û�������û���");
    }
    if(stu.getPass().isEmpty()){
      addFieldError("stu.pass","û����������");
    }
  }
  @Override public String execute() {
    System.out.println(stu.getUsername());
    if (stu.getUsername().equalsIgnoreCase("admin")) {
      Map session=ActionContext.getContext().getSession();
      session.put("username",stu.getUsername());
      return "success";
    } else {
      return "fail";
    }
  }
}
