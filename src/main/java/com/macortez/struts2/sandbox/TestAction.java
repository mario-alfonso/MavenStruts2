package com.macortez.struts2.sandbox;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

/**
 * 
 */
@Conversion()
public class TestAction extends ActionSupport{

  String message;
  String firstName;

  public String execute() {
    System.out.println("Execute method");
    message = "SUCCESS message";
    System.out.println("Name -" + firstName );

    return "success"; 
    //return "error";
  }

  public String getMessage() {
    return message;
  }

  public void setMessage( String message ) {
    this.message = message;
  }

  public String getFirstName() {
    return message;
  }

  public void setFirstName( String firstName ) {
    this.firstName = firstName;
  }
}