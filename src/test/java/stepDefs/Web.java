package stepDefs;


import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.model.Log;

import hooks.hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjs.PageObjects;
import utilities.common;
 
public class Web extends common {
	WebDriver driver = common.driver;
	PageObjects pg = new PageObjects(driver);
	private static Logger log = LogManager.getLogger(Web.class.getName());

	
	    	
	@Given("User clicks on Add to Cart button")
	public void addToCart() throws InterruptedException {
		pg.getAddTOCartButton().click();
		Thread.sleep(2000);
		System.out.println("Clicked on Add to Cart Button");
				
	}
 
	@When("User clicks on Cart Image and Checkout button")
	public void clickCartImage() throws InterruptedException {
		pg.getCartImage().click();
		Thread.sleep(2000);
		System.out.println("Clicked on Cart Image");
		
	}
 
	@Then("Validate user is navigated to Cart details page")
	public void Validation() throws InterruptedException {
		pg.getCheckOutButton().click();
		System.out.println("Clicked on Checkout Button");
		Thread.sleep(4000);
	}
 
	@Given("Another precondition is given")
	public void another_precondition_is_given() {
	   System.out.println("Another precondition is given");

		//log.debug("I am debugging");
		//log.error("print error message using Log4j");
		//log.error("print error message using Log4j");
		//log.fatal("print error message using Log4j");
		//log.debug("I am debugging");
		//log.info("I am debugging info");
	}
 

 
}