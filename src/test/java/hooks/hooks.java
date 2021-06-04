package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.common;


public class hooks extends common {
	public WebDriver driver;
				
  @Before ("@Web")
   public void setUp() throws IOException{ 
      System.out.println("Before Web Hooks");      
      driver =initializeDriver();
      driver.get(prop.getProperty("url"));   
          
      
   }
   @Before("@Mobile") 
   public void setUp1(){ 
      System.out.println("Before Mobile Hooks"); 
   }
   
   @After("@Web") 
   public void tearDown(){ 
	  driver.close();
      System.out.print("After Hooks"); 
   } 
   
}