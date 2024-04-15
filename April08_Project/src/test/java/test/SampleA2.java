package test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleA2 {

	public static void main(String[] args) throws Exception {
		
		
	 System.out.println(getData("FirstName"));
	 System.out.println(getData("LastName"));
	 System.out.println(getData("Address"));
	 System.out.println(getData("MobileNumber"));
		
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

}
