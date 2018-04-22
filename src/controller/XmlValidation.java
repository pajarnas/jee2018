package controller;

import java.util.Date;
import java.util.GregorianCalendar;

import com.opensymphony.xwork2.ActionSupport;

import domain.Stu;

public class XmlValidation extends ActionSupport {
  int test_int;
  double test_double;
  String test_required;
  String test_requiredstring;
  String test_stringlength;
  String email;
  Date date;
  String pass;
  String repass;
  Stu stu;
  int test_int_fieldexpression;

  public Stu getStu() {
    return stu;
  }

  public void setStu(Stu stu) {
    this.stu = stu;
  }

  public int getTest_int() {
    return test_int;
  }

  public void setTest_int(int test_int) {
    this.test_int = test_int;
  }

  public double getTest_double() {
    return test_double;
  }

  public void setTest_double(double test_double) {
    this.test_double = test_double;
  }

  public String getTest_required() {
    return test_required;
  }

  public void setTest_required(String test_required) {
    this.test_required = test_required;
  }

  public String getTest_requiredstring() {
    return test_requiredstring;
  }

  public void setTest_requiredstring(String test_requiredstring) {
    this.test_requiredstring = test_requiredstring;
  }

  public String getTest_stringlength() {
    return test_stringlength;
  }

  public void setTest_stringlength(String test_stringlength) {
    this.test_stringlength = test_stringlength;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }
  public Date getMinDate(){
    return new GregorianCalendar(2010,0,1).getTime();
  }
  public Date getMaxDate(){
    return new GregorianCalendar(2020,0,1).getTime();
  }

  public int getTest_int_fieldexpression() {
    return test_int_fieldexpression;
  }

  public void setTest_int_fieldexpression(int test_int_fieldexpression) {
    this.test_int_fieldexpression = test_int_fieldexpression;
  }

  public String getRepass() {
    return repass;
  }

  public void setRepass(String repass) {
    this.repass = repass;
  }
  
  
}
