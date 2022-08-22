package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver;
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
		try {
			//open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
		    //maximize browser
				  driver.manage().window().maximize();
				  
		    //how to open the URL
				  driver.get("https://www.dell.com/en-us");
				  Thread.sleep(3000);
				  
		} catch (Exception e)  {
			System.out.println("Browser or URL issue detected");
		}
	}

	
	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
			try {
				Actions act = new Actions(driver);
				DellActionPOM obj = new DellActionPOM(driver);
				act.moveToElement(obj.hoversolutions()).build().perform();
				Thread.sleep(3000);
				obj.solutions().click();
				Thread.sleep(3000);
				}		
			
			catch (Exception e) {
					System.out.println("WebElement cannot be found");
				}
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
		driver.quit();
	}

	
}
