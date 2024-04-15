package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA2 {

	public static void main(String[] args) {
		updateData("FirstName","AABBCC");
	}
	public static void updateData(String fieldName,String value)
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
					XSSFRow row =  sh.getRow(i);
					XSSFCell cell = row.createCell(1);
					cell.setCellValue(value);
					FileOutputStream fos = new FileOutputStream(src);
					wb.write(fos);
					fos.close();
					
				}
			}
			
		} catch (Exception e) {
			
		}
	}
	
	
}
