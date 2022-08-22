package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.GamingDealsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GamingDealsValidation {

	WebDriver driver;
	@Given("^User is on Dell Big Homepage$")
	public void user_is_on_Dell_Big_Homepage() throws Throwable {
		//opens browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//visit website
		driver.get("https://dell.com");
		Thread.sleep(3000);
		

	}

	@When("^User clicks on Deals$")
	public void user_clicks_on_Deals() throws Throwable {
		GamingDealsPOM obj = new GamingDealsPOM(driver);
		obj.deals().click();
		Thread.sleep(3000);

	}

	@When("^User clicks on Gaming PC Deals$")
	public void user_clicks_on_Gaming_PC_Deals() throws Throwable {
		GamingDealsPOM obj = new GamingDealsPOM(driver);
		obj.gaming().click();


	}

	@Then("^User redirecterd to Gaming PC Deals Page$")
	public void user_redirecterd_to_Gaming_PC_Deals_Page() throws Throwable {
	}

	
	
}
