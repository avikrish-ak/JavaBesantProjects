package test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(getXpath("FirstName"))).sendKeys(getData("FirstName"));
		driver.findElement(By.xpath(getXpath("LastName"))).sendKeys(getData("LastName"));
		driver.findElement(By.xpath(getXpath("Address"))).sendKeys(getData("Address"));
		driver.findElement(By.xpath(getXpath("MobileNumber"))).sendKeys(getData("MobileNumber"));
		driver.findElement(By.xpath(getXpath("Male"))).click();
		driver.findElement(By.xpath(getXpath("FirstName"))).clear();;
	}
	public static String getData(String fieldName)
	{
		try {
			File src = new File("./src/test/resources/DataSheet/TestData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Application");
			DataFormatter format = new DataFormatter();
			
			for(int i=0;i<=sh.getLastRowNum();i=i+1)
			{
				if(format.formatCellValue(sh.getRow(i).getCell(0)).equals(fieldName))
				{
					return format.formatCellValue(sh.getRow(i).getCell(1));
				}
			}
			return "";
			
		} catch (Exception e) {
			return "";
		}
	}
	
	public static String getXpath(String fieldName)
	{
		try {
			File src = new File("./src/test/resources/DataSheet/TestData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Application");
			DataFormatter format = new DataFormatter();
			
			for(int i=0;i<=sh.getLastRowNum();i=i+1)
			{
				if(format.formatCellValue(sh.getRow(i).getCell(0)).equals(fieldName))
				{
					return format.formatCellValue(sh.getRow(i).getCell(2));
				}
			}
			return "";
			
		} catch (Exception e) {
			return "";
		}
	}

}
