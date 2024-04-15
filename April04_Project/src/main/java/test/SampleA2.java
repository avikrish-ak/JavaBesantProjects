package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./src/test/resources/screenshot/app.png");
		
		FileUtils.copyFile(src, des);
	}

}
