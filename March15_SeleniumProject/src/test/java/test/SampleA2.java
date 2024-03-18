package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://demo.automationtesting.in/Register.html"))
		{
			System.out.println("User landed in correct application");
		}
		else
		{
			System.out.println("User landed in In-correct Application");
		}
		
	}

}
