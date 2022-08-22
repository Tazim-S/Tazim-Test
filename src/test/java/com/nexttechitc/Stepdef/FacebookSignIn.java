package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.FacebookSignInPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignIn {

	WebDriver driver;
	@Given("^User is on Facebook Main Page$")
	public void user_is_on_Facebook_Main_Page() throws Throwable {
		
		//Code to Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		//Code to maximize browser
		  driver.manage().window().maximize();
		  
		  //how to open the URL
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(3000);
	}

	@When("^User enters valid \"([^\"]*)\" and valid \"([^\"]*)\"\\.$")
	public void user_enters_valid_and_valid(String arg1, String arg2) throws Throwable {
		
		FacebookSignInPOM obj = new FacebookSignInPOM(driver);
		obj.clickemail().sendKeys(arg1);    //will enter email details
		Thread.sleep(2000);
		obj.clickpassword().sendKeys(arg2);  //will enter password details
	    Thread.sleep(2000);
	    obj.signin().click();				 //will click on sign in
	    Thread.sleep(2000);
		
	}

	@Then("^User successfully logs into Facebook\\.$")
	public void user_successfully_logs_into_Facebook() throws Throwable {
	   driver.quit();
	}

	
}
