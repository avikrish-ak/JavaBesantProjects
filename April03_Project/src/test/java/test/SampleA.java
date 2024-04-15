package test;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleA {

	public static void main(String[] args) {
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a[@class='nav-a  ']"));
		List<String> tabNames = new LinkedList<String>();
		String[] expectedText = {"Fresh", "Amazon miniTV", "Sell", "Best Sellers", "Mobiles", "Today's Deals", "Prime",			
	"Customer Service", "Electronics", "New Releases", "Home & Kitchen", "Amazon Pay", "Fashion", "Gift Ideas",
	"Computers", "Books", "Toys & Games", "Home Improvement", "Car & Motorbike", "Coupons", "Sports, Fitness & Outdoors", "Beauty & Personal Care",
	"Grocery & Gourmet Foods", "Gift Cards", "Health, Household & Personal Care", "Video Games", "Baby", "Custom Products", "Pet Supplies", "Subscribe & Save", "Audible",
	"AmazonBasics"};
		
		if(tabs.size()==32)
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
			System.out.println("Tabs Size Incorrect expected size is 31 but "+tabs.size());
		}
		
		
		

	}

}
