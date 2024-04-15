package test;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleA2 {

	public static void main(String[] args) {
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='navbar-brand-centered']//li//a[contains(@style,'size')]"));
		List<String> tabNames = new LinkedList<String>();
		String[] expectedText = {"Selenium", "Insurance Project","Agile Project","Bank Project","Security Project","Telecom Project","Payment Gateway Project","New Tours"};
		if(tabs.size()==8)
		{
			int index =0;
		for(WebElement x :tabs)
		{
			Actions action = new Actions(driver);
			action.moveToElement(x).build().perform();
			if(x.getText().trim().equals(expectedText[index])) {
				System.out.println(expectedText[index]+" is displayed");
				tabNames.add(x.getText());
			}
			else
			{
				System.out.println(expectedText[index]+" is not displayed this is actual text is displayed in web page "+x.getText());
			}
			index=index+1;
		}
		}
		else
		{
			System.out.println("Tabs Size Incorrect expected size is 8 but "+tabs.size());
		}
		
		
		

	}

}
