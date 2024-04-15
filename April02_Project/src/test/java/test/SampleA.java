package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleA {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath(" //a[contains(text(),'BANK')] "));
		WebElement trg = driver.findElement(By.id("bank"));
		
		
		Actions x = new Actions(driver);
		x.dragAndDrop(src, trg).build().perform();
		
		
		src = driver.findElement(By.xpath(" //a[contains(text(),'SALES')] "));
		trg = driver.findElement(By.id("loan"));
		
		x.dragAndDrop(src, trg).build().perform();
		

	}

}
