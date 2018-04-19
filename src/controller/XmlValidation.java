package controller;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class XmlValidation extends ActionSupport {
  int test_int;
  double test_double;
  String test_required;
  String test_requiredstring;
  String test_stringlength;
  String email;
  Date date;

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
  
}
