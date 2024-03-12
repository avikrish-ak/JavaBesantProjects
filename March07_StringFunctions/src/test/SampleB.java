package test;

import java.util.Arrays;

public class SampleB {

	public static void main(String[] args) {
	
		
		String x ="good morning";
		String y= "GOOD DAY";
		String z= "GoOd EveNING";
		String a="abc 123 !@# ABC";
		
		System.out.println(x.contains("ood"));//true
		System.out.println(x.contains("ooD"));//false
		System.out.println(y.contains("OOD"));//true
		System.out.println(y.contains("DaY"));//false
		System.out.println("________________________________");
		System.out.println(x.equals("good morning"));//true
		System.out.println(x.equals("Good morninG"));//false
		System.out.println(x.equals("goodmorning"));//false
		System.out.println(x.equals("good morning "));//false
		System.out.println("________________________________");
		System.out.println(x.startsWith("go"));//true
		System.out.println(x.startsWith("GO"));//false
		System.out.println(x.startsWith(" go"));//false
		System.out.println(x.startsWith("1go"));//false
		System.out.println("________________________________");
		System.out.println(x.endsWith("ing"));
		System.out.println(x.endsWith("g"));
		System.out.println(x.endsWith("ng"));
		System.out.println(x.endsWith("ing "));
		System.out.println(x.endsWith("inG"));
		
	}

}
