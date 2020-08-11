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

  public String execute() {
    System.out.println("Execute method");

    //return "success";
    return "error";
  }
}