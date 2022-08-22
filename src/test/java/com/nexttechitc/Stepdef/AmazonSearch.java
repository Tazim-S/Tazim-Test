package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearch {

	
	WebDriver driver;
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		try {
	//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
    //implicit wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //maximize browser
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
    //how to open the URL
		  driver.get("https://www.amazon.com");
		  Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("Browser error");
		}
	}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
		try {
		AmazonSearchPOM obj = new AmazonSearchPOM(driver);
		obj.amazonsearch().sendKeys(arg1);
		obj.searchicon().click();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		}
		catch(Exception e) {
				System.out.println("Amazon Search Option Error");
		}
	}

	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
		//what is the difference between driver.close and driver.quit
		driver.quit();
		
	}
	


}
