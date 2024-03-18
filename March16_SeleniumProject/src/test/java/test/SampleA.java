package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleA {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		/*
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);//Java Delay
		
		driver.switchTo().alert().accept();//click Ok button in Alert
		
		*/
		
		/*
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		*/
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		
		String alertText = driver.switchTo().alert().getText();
		
		
		if(alertText.equals("Please enter your name"))
		{
		Thread.sleep(5000);
		
		driver.switchTo().alert().sendKeys("Besant Tech");
		
		
		driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("You are in wrong Alert popup..!");
		}
		
	}

}
