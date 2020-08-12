package com.macortez.struts2.sandbox;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import java.util.List;
import java.util.ArrayList;

import com.macortez.struts2.model.Product;

/**
 * 
 */
@Conversion()
public class WelcomeAction extends ActionSupport{

  String firstName;
  String lastName;
  String gender;
  Integer age;
  String email;
  String address;
  String selectedColor;
  List<String> colors;
  Boolean subscription;
  String          selectedHobbies;
  List<Product>   products;

  public void initializeFormFields() {
    initializeColors();
  }

  public void initializeColors() {
    colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("White");
  }

  public String execute() {
    System.out.println("Execute method");
    System.out.println("Name -" + firstName );

    if ( subscription == true ) {
      System.out.println("You are a subscriber");
    } else {
      System.out.println("You are NOT a subscriber");
    }

    return "success"; 
    //return "error";
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName( String firstName ) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName( String lastName ) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender( String gender ) {
    this.gender = gender;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge( Integer age ) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail( String email ) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress( String address ) {
    this.address = address;
  }

  public String getSelectedColor() {
    return selectedColor;
  }

  public void setSelectedColor( String selectedColor ) {
    this.selectedColor = selectedColor;
  }

  public List<String> getColors() {
    return colors;
  }

  public void setColors( List<String> colors ) {
    this.colors = colors;
  }


  public Boolean getSubscription() {
    return subscription;
  }

  public void setSubscription( Boolean subscription ) {
    this.subscription = subscription;
  }

  public String getSelectedHobbies() {
    return selectedHobbies;
  }

  public void setSelectedHobbies( String selectedHobbies ) {
    this.selectedHobbies = selectedHobbies;
  }

  public List<Product> getHobbies() {
    return products;
  }

  public void setHobbies( List<Product> products ) {
    this.products = products;
  }
/*  
  public void validate() {

    if (this.firstName.equals("")) {
      addFieldError("firstName","First Name is required.");
    }

    if (this.lastName.equals("")) {
      addFieldError("lastName","Last Name is required.");
    }

    if ( this.gender == null ) {
      addFieldError("gender","Gender can not be empty.");
    }

    if ( this.age  == null ) {
      addFieldError("age","Age can not be empty.");
    } else if ( this.age <= 18 ) {
      addFieldError("age","Age should be above 18.");
    }

    if (this.email.equals("")) {
      addFieldError("email","Email is required.");
    }

  } */
}