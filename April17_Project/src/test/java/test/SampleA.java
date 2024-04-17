package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		JavascriptExecutor x = (JavascriptExecutor)driver;
		//x.executeScript("window.scrollBy(0,360)", "");
		//x.executeScript("location.reload()", "");
		x.executeScript("document.getElementById('user_email_login').value='testing@gmail.com';");
		x.executeScript("document.getElementById('user_password').value='secret_sauce';");
		Thread.sleep(3000);
		x.executeScript("document.getElementById('user_submit').click();");
		

	}

}
