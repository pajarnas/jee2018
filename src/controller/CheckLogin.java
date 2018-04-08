package controller;

import java.util.Map;

import org.slf4j.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.StuDAO;
import dao.StuDAOImp;

public class CheckLogin extends ActionSupport {
  private final static Logger logger = LoggerFactory.getLogger(CheckLogin.class);
  String pass;

  public void setPass(String pass) {
    this.pass = pass;
    System.out.println("赋值：" + this.pass);
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

  @Override
  public void validate() {
    if (username.isEmpty()) {
      addFieldError("username", "没有输入用户名");
    }
    if (pass.isEmpty()) {
      addFieldError("pass", "没有输入密码");
    }
  }

  @Override
  public String execute() {
    logger.error("{}",username);
    if (username.equalsIgnoreCase("admin")) {
      Map session = ActionContext.getContext().getSession();
      session.put("username", username);
      return "success";
    } else {
      return "fail";
    }
  }

  public String checkInDb() throws Exception {
    StuDAO dao = new StuDAOImp();
    boolean isSuc = dao.check(username, pass);
    return isSuc ? SUCCESS : "fail";
  }
}