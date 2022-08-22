package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {

	WebDriver driver;
    public  DellActionPOM (WebDriver driver) {
 this.driver=driver;
 PageFactory.initElements(driver, this);
 }
    //full xpath: /html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span
	 @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span")
	   WebElement hover_solutions;
	   public WebElement hoversolutions(){
	  return hover_solutions;
	   }
	  
	  
	  //full xpath: /html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/a//
	 @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/a")
	 	WebElement click_solutions;
	 	public WebElement solutions() {
	 		return click_solutions;  
	    }
    
    
    
}
