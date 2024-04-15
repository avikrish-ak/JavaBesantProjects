package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Saucedemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");		
	}
	
	@Test
	public void testCase01()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void testCase02()
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}
	
	
	
	@AfterMethod
	public void afterCheck()
	{
		if(driver.getCurrentUrl().contains("https://www.saucedemo.com/") && 
				driver.getTitle().equals("Swag Labs"))
		{
			System.out.println("User landed in Swag Labs Application");
		}
		else
		{
			System.out.println("User Not landed in Swag Labs Application");
		}
	}
	
	@AfterTest
	public void closeProject()
	{
		driver.close();
	}
	
	
	
	

}
