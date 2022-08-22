package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.FBSignUpValidationPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSignUpValidation {

	WebDriver driver;
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		try {
			//open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
	    //maximize browser
			  driver.manage().window().maximize();
			  
	    //how to open the URL
			  driver.get("https://www.facebook.com/reg/");
			  Thread.sleep(3000);

		} catch (Exception e) {
				System.out.println("URL/Browser error");
				
			}
	    
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		Actions a = new Actions(driver);
		FBSignUpValidationPOM obj = new FBSignUpValidationPOM(driver); 
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.confemail().sendKeys(arg3);
		obj.password().sendKeys(arg4);
		
		
		
		Thread.sleep(3000);
	
	    
	}


	@Then("^users select dropdown \"([^\"]*)\" and dropdown \"([^\"]*)\" and dropdown \"([^\"]*)\"$")
	public void users_select_dropdown_and_dropdown_and_dropdown(String arg1, String arg2, String arg3) throws Throwable {
	    FBSignUpValidationPOM obj = new FBSignUpValidationPOM (driver);
	    Select s2 = new Select(obj.click_month);
		s2.selectByValue(arg1);
	    Select s1 = new Select(obj.click_day);
		s1.selectByValue(arg2);
		Select s3 = new Select(obj.click_year);
		s3.selectByValue(arg3);
		obj.click_sex.click();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
