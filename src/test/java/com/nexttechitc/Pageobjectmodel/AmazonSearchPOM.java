package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public  AmazonSearchPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	 
	    

	 @FindBy(name="field-keywords")
	   WebElement type_amazonsearch;
	   public WebElement amazonsearch(){
	   return type_amazonsearch;
	  
	    }
	@FindBy(id="nav-search-submit-button")
		WebElement click_searchbutton;
		public WebElement searchicon() {
		return click_searchbutton;
			
		}
		
	
}
