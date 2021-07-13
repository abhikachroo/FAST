package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

public class common {	

	public static  WebDriver driver;
	public static WindowsDriver<WindowsElement> wdriver;
	public static Properties prop;
	
	public static WebDriver initializeDriver() throws IOException
	{
		
	 prop= new Properties();
	 FileInputStream fis=new FileInputStream("D:\\workspace\\FAST\\src\\test\\resources\\properties.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\workspace\\FAST\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
			
		
	}
	else if (browserName.equals("firefox"))
	{
		// driver= new FirefoxDriver();
		
	}
	else if (browserName.equals("IE"))
	{
		//		IE code
	}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;


	}

	//public static WindowsDriver<WindowsElement> initializeWDriver() throws IOException
	//{
	

	//}

	public static WindowsDriver<WindowsElement> initializeWDriver() throws IOException {
		DesiredCapabilities options = new DesiredCapabilities();
		//options.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		options.setCapability("app", "C:\\Windows\\System32\\notepad.exe");		
		options.setCapability("deviceName", "WindowsPC");
		wdriver = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"), options);
		wdriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		return wdriver;

		
	}




	
	//public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	//{
	//	TakesScreenshot ts=(TakesScreenshot) driver;
	//	File source =ts.getScreenshotAs(OutputType.FILE);
	//	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	//	FileUtils.copyFile(source,new File(destinationFile));
	//	return destinationFile;


	//}

	//}


}
