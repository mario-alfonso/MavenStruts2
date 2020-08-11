package com.macortez.struts2.sandbox;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

/**
 * 
 */
@Conversion()
public class WelcomeAction extends ActionSupport{

  String firstName;

  public String execute() {
    System.out.println("Execute method");
    System.out.println("Name -" + firstName );

    return "success"; 
    //return "error";
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName( String firstName ) {
    this.firstName = firstName;
  }
}