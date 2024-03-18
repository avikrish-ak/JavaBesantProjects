package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleA {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		
		String type = pwd.getAttribute("type");
		
		
		if(type.equals("password"))
		{
			System.out.println("Password Field");
		}
		else
		{
			System.out.println("Text Field");
		}
		
		
	}

}
