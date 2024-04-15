package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> headerElementList = driver.findElements(By.xpath("//table[@class='dataTable']//thead//th"));
		
		for(WebElement headerElement : headerElementList)
		{
			System.out.println(headerElement.getText());
		}

		
		List<WebElement> companyElementList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		for(WebElement companyElement : companyElementList)
		{
			System.out.println(companyElement.getText());
		}
	}

}
