package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Saucedemo {
	
	WebDriver driver;
	@Test(dataProvider = "testDataValue")
	public void testCase01(String name,String pwd)
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.findElement(By.id("user-name")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
	}
	
	
	@DataProvider(name = "testDataValue")
	public Object[][] testData()
	{
		return new Object[][] {{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"}};
		
	}
	
	
	

}
