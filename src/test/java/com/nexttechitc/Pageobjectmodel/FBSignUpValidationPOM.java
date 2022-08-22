package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignUpValidationPOM {

	
	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public  FBSignUpValidationPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	      
	      @FindBy(xpath="//*[@name=\"firstname\"]")
	      WebElement edit_firstname;
	      public WebElement firstname() {
	      return edit_firstname;
	        }
	      @FindBy(name="lastname")
	      WebElement edit_lastname;
	      public WebElement lastname() {
	      return  edit_lastname;
	         }
	          
	      @FindBy(name="reg_email__")
	      WebElement edit_email;
	      public WebElement email() {
	      return  edit_email;
	      }
	      
	      @FindBy(name="reg_email_confirmation__")
	      WebElement confirm_email;
	      public WebElement confemail() {
	    	  return confirm_email;
	      }
	      

	      @FindBy(id="password_step_input")
	       WebElement edit_password;
	       public WebElement password() {
	       return  edit_password;
	           }
	          
	         @FindBy(xpath="//*[@id=\"month\"]")
	      public WebElement click_month;
	          
	         @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")
	         public WebElement click_sex;
	        
	            
	       @FindBy(id="day")
	      public WebElement click_day;
	              
	              
	       @FindBy(id="year")
	      public WebElement click_year;
	              
}
	      
	      
	 
