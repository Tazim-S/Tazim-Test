package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignInPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with class name
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public  FacebookSignInPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	 
	    
	  //Xpath to find Email Webelement
	 @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
	   WebElement click_email;
	   public WebElement clickemail(){
	  return click_email;
	   }
	  
	  //Xpath to find the Password Webelement
	  @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
	   WebElement click_password;
	   public WebElement clickpassword(){
	  return click_password;
	 
	   }
	   
	  //Xpath to find the Log In Webelement
	  @FindBy (xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	   WebElement click_signin;
	  public WebElement signin() {
		  return click_signin;
	  }
	  
}
