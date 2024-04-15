package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SampleA {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Core Java: An Integrated Approach, New: Includes All Versions upto Java 8'])[1]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Python"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Core Python Programming, 3ed: Covers fundamentals to advanced topics like OOPS, Exceptions, Data structures, Files, Threads, Net'])[1]")).click();
		Actions action = new Actions(driver);
		
		
		Set<String> windowIds = driver.getWindowHandles();
		
		
		System.out.println(windowIds);
		
		
		for(String id:windowIds)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Core Java: An Integrated Approach"))
			{
				Thread.sleep(3000);
				Select dropdown = new Select(driver.findElement(By.name("quantity")));
				dropdown.selectByValue("3");
				action.click(driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]"))).build().perform();
			}
			if(driver.getCurrentUrl().contains("Core-Python-Programming"))
			{
				Thread.sleep(3000);
				Select dropdown = new Select(driver.findElement(By.name("quantity")));
				dropdown.selectByValue("2");
				action.click(driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]"))).build().perform();
				
			}
			
		}
		
		
		
		

	}

}
