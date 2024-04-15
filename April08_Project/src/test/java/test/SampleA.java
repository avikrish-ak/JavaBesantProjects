package test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleA {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("./src/test/resources/DataSheet/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Application");
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(3).getCell(1).getNumericCellValue());
		
		DataFormatter format = new DataFormatter();
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(3).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(3).getCell(1)));
		
		
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getRow(0).getLastCellNum());
		
		
	}

}
