package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamingDealsPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public  GamingDealsPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	 
	    

	 @FindBy(xpath="//ul[@aria-label=\"Deals\"]")
	   WebElement click_deals;
	   public WebElement deals(){
	  return click_deals;
	   }
	   
	 @FindBy(xpath="//a[@href=\"//deals.dell.com/en-us/category/gamingpcs\"]")
	 	WebElement click_gaming_pcs;
	 	public WebElement gaming() {
	 return click_gaming_pcs;
	 	}
}
