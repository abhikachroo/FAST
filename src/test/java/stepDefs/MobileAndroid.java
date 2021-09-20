package stepDefs;


import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.model.Log;

import hooks.hooks;
import io.appium.java_client.android.AndroidElement;
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
	mdriver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	Thread.sleep(5000);
	mdriver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();			
	mdriver.findElement(By.id("android:id/checkbox")).click();
    mdriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
    mdriver.findElement(By.className("android.widget.EditText")).sendKeys("Text Enter");
    mdriver.findElements(By.className("android.widget.Button")).get(1).click();			
				
						
	}
 
 
	
}