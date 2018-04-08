package domain;

public class Stu {
  private long id;  
  private String username,pass;
  private double math,java,os;
  public Stu(){}
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPass() {
    return pass;
  }
  public void setPass(String pass) {
    this.pass = pass;
  }
  public double getMath() {
    return math;
  }
  public void setMath(double math) {
    this.math = math;
  }
  public double getJava() {
    return java;
  }
  public void setJava(double java) {
    this.java = java;
  }
  public double getOs() {
    return os;
  }
  public void setOs(double os) {
    this.os = os;
  }
  
}
