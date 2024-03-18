package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("TestA");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("TestB");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Chennai");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("123456789");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[3]/input")).click();
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).clear();
		
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[3]/input")).click();
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")).click();
	}

}
