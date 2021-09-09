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
 
public class MobileAndroid extends common {
	WebDriver mdriver = common.mdriver;
	PageObjects pg = new PageObjects(driver);
	private static Logger log = LogManager.getLogger(MobileAndroid.class.getName());
	
	
	    	
	@Given("Launch the APK app")
	public void launchApp() throws InterruptedException {
				System.out.println("Mobile App launched");
	}
 
	@When("User clicks on Cart Image and Checkout button")
	public void clickCartImage() throws InterruptedException {
				
	}
 
	@Then("Validate user is navigated to Cart details page")
	public void Validation() throws InterruptedException {
			}
 
	
}