package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellCloudSolutionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellCloudSolutions {

	
	
	WebDriver driver;
	
	@Given("^User is on the Dell Home Page$")
	public void user_is_on_the_Dell_Home_Page() throws Throwable {
		try {
			//open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
	    //maximize browser
			  driver.manage().window().maximize();
			  
	    //how to open the URL
			  driver.get("https://www.dell.com/");
			  Thread.sleep(3000);

		} catch (Exception e) {
				System.out.println("URL/Browser error");
				
			}
	}

	@When("^User clicks on solutions, then hovers over Cloud solutions$")
	public void user_clicks_on_solutions_then_hovers_over_Cloud_solutions() throws Throwable {	   
	    DellCloudSolutionsPOM obj = new DellCloudSolutionsPOM(driver);
	    Actions act = new Actions(driver);
	    act.moveToElement(obj.hoversolutions()).build().perform();
	    Thread.sleep(3000);
	    act.moveToElement(obj.hovercloudsolutions()).build().perform();
	    Thread.sleep(3000);
	    
	    
	}

	@When("^User clicks on view all cloud solutions$")
	public void user_clicks_on_view_all_cloud_solutions() throws Throwable {
		DellCloudSolutionsPOM obj = new DellCloudSolutionsPOM(driver);
		obj.viewallcloudsolutions().click();
		Thread.sleep(3000);
	    
	}

	@Then("^User is redirected to All Cloud Solutions$")
	public void user_is_redirected_to_All_Cloud_Solutions() throws Throwable {
	    driver.quit();
	}

}
