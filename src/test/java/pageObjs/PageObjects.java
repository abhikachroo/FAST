package pageObjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	
	public WebDriver driver;
	
	//All Page Objects should go here using locators
	
	By AddToCartButton=By.xpath("//button[text()='ADD TO CART']");
	By CartImage=By.xpath("//img[@alt='Cart']");
	By CheckOutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");


	// This is constructor to initiate driver
	public PageObjects(WebDriver driver) {		
		this.driver=driver;		
	}
	
	
	//All getter methods for Locators

	public WebElement getAddTOCartButton()
	{
		return driver.findElement(AddToCartButton);
	}
	public WebElement getCartImage()
	{
		return driver.findElement(CartImage);
	}
	public WebElement getCheckOutButton()
	{
		return driver.findElement(CheckOutButton);
	}

}
