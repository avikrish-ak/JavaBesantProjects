package test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleA3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		JavascriptExecutor x = (JavascriptExecutor)driver;
		x.executeScript("window.scrollBy(0,120)", "");
		driver.findElement(By.id("user_email_login")).sendKeys("test@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("test123456");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user_submit"))));
		x.executeScript("document.getElementById('user_submit').click();");
		
		
	}

}
