package com.macortez.struts2.registration;

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
public class RegisterAction extends ActionSupport{

  String          firstName;
  String          lastName;
  String          gender;
  String          age;
  String          email;
  List<String>    colors;
  Boolean         subscription;
  List<String>    hobbies;
  String          selectedHobbies;
  List<Product>   products;

  public String initializeFormFields() {
    initializeColors();
    initializeHobbies();
    initializeProducts();

    return "input";
  }

  public void initializeColors() {
    colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("White");
  }

  public void initializeHobbies() {
    hobbies = new ArrayList<String>();
    hobbies.add("Drawing");
    hobbies.add("Teaching");
    hobbies.add("Singing");
    hobbies.add("Programming");
  }

  public void initializeProducts() {
    products = new ArrayList<Product>();
    products.add(new Product(111, "Mobile Phone", 10000));
    products.add(new Product(222, "Camara", 7000));
    products.add(new Product(333, "TV", 20000));
    products.add(new Product(444, "Laptop", 30000));
  }

  public String execute() {
    System.out.println("Execute method");
    System.out.println("Name -" + firstName );

    if ( subscription == true ) {
      System.out.println("You are a subscriber");
    } else {
      System.out.println("You are NOT a subscriber");
    }

    return "display"; 
    //return "error";
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName( String firstName ) {
    this.firstName = firstName;
  }

  public Boolean getSubscription() {
    return subscription;
  }

  public void setSubscription( Boolean subscription ) {
    this.subscription = subscription;
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

  public String getSelectedHobbies() {
    return selectedHobbies;
  }

  public void setSelectedHobbies( String selectedHobbies ) {
    this.selectedHobbies = selectedHobbies;
  }

  public String getAge() {
    return age;
  }

  public void setAge( String age ) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail( String email ) {
    this.email = email;
  }  

  public List<String> getColors() {
    return colors;
  }

  public void setColors( List<String> colors ) {
    this.colors = colors;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies( List<String> hobbies ) {
    this.hobbies = hobbies;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts( List<Product> products ) {
    this.products = products;
  }

}