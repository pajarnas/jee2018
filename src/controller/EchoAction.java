package controller;

import com.opensymphony.xwork2.ActionSupport;

public class EchoAction extends ActionSupport {
  private String name;
  private String qq;
  private String memo;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getQq() {
    return qq;
  }
  public void setQq(String qq) {
    this.qq = qq;
  }
  public String getMemo() {
    return memo;
  }
  public void setMemo(String memo) {
    this.memo = memo;
  }
  
}
