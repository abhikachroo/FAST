package stepDefs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import hooks.hooks;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common;

public class Desktop extends common {
	WindowsDriver<WindowsElement> wdriver;
	
	public Desktop() throws IOException {
		wdriver=common.initializeWDriver();
	}
	
	public static String getDate(){
	 LocalDate date = LocalDate.now();
	 return date.toString();
	 }
	
	@Given("User cliked Help in Notepad app")
	public void helpInNotepad() throws IOException {
		

		
		
		wdriver.findElementByName("Help").click();		
		wdriver.findElementByName("About Notepad").click();
		wdriver.findElementByName("OK").click();		
		System.out.println("User clicked About Option In Notepad");
		
	}
	
	@When("User enters current date in Notepad")
	public void enterTextInNotepad() throws MalformedURLException {
		
		wdriver.findElementByClassName("Edit").sendKeys(getDate());
		wdriver.findElementByClassName("Edit").clear();		
		System.out.println("User entered Current Date");
		
	}
	@Then("Validate Notepad")
	public void validateNotepad() throws MalformedURLException {
		
		System.out.println("Notepad Validations");
		 		
	}


}
