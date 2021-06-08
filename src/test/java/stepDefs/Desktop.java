package stepDefs;

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
	
	@Given("First Desktop Scenario")
	public void first_desktopscenario() throws MalformedURLException {
		
		
		wdriver.findElementByName("Help").click();		
		wdriver.findElementByName("About Notepad").click();
		wdriver.findElementByName("OK").click();
		wdriver.findElementByClassName("Edit").sendKeys(getDate());
		wdriver.findElementByClassName("Edit").clear();
		
		System.out.println("First Desktop Scenario");
		
	}
	@Given("Second Desktop Scenario")
	public void second() {
		wdriver.findElementByClassName("Edit").sendKeys(getDate());
		wdriver.findElementByClassName("Edit").clear();	
		System.out.println("Second Desktop Scenario");
		
	}

}
