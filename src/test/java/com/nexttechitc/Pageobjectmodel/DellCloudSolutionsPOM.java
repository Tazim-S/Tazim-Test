package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellCloudSolutionsPOM {

	WebDriver driver;
	public DellCloudSolutionsPOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span")
	   WebElement hover_solutions;
	   public WebElement hoversolutions(){
	  return hover_solutions;
	   }
	   
	 @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[4]/button")
	 WebElement hover_CloudSolutions;
	 public WebElement hovercloudsolutions() {
		 return hover_CloudSolutions;
	 }
	
	 @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[4]/ul/li[3]/a")
	 WebElement click_viewallcloudsolutions;
	 public WebElement viewallcloudsolutions() {
		 return click_viewallcloudsolutions;
	 }
	
	
	
}
