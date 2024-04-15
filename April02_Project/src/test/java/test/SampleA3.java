package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleA3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions x = new Actions(driver);
		x.doubleClick(driver.findElement(By.xpath(" //button[contains(text(),'Double-Click Me To See Alert')] "))).build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
