package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public  BestSellerPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	 
	    

	 @FindBy(xpath="//a[@data-csa-c-content-id=\"nav_cs_bestsellers\"]")
	   WebElement click_bestseller;
	   public WebElement bestseller(){
	  return click_bestseller;
	  
	    }
	 

}
