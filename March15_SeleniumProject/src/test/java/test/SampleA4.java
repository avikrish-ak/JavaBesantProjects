package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleA4 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		if(firstName.isEnabled())
		{
			firstName.sendKeys("Testing");
		}
		else
		{
			System.out.println("FirstName Text Field is disabled");
		}
		
		
	}

}
