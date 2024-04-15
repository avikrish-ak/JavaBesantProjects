package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SampleB {

	public static void main(String[] args) {
	
		File x =new File("C:/testing1/test.txt");
		try {
			FileInputStream y = new FileInputStream(x);
			System.out.println("####");
			Thread.sleep(3000);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not ******* Found ------"+e.getMessage());
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("@@@@@@@@@@@@@@@");

	}

}
