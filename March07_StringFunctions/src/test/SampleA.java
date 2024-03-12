package test;

import java.util.Arrays;

public class SampleA {

	public static void main(String[] args) {
	
		
		String x ="good morning";
		String y= "GOOD DAY";
		String z= "GoOd EveNING";
		String a="abc 123 !@# ABC";
		
		
		System.out.println(x.length());
		System.out.println(y.length());
		System.out.println(z.length());
		System.out.println(a.length());
		
		
		System.out.println(x.toUpperCase());
		System.out.println(y.toUpperCase());
		System.out.println(z.toUpperCase());
		System.out.println(a.toUpperCase());
		
		
		
		System.out.println(x.toLowerCase());
		System.out.println(y.toLowerCase());
		System.out.println(z.toLowerCase());
		System.out.println(a.toLowerCase());
		
		
		System.out.println(Arrays.toString(x.split("r")));
		System.out.println(Arrays.toString(y.split("D D")));
		System.out.println(Arrays.toString(z.split("N")));
		System.out.println(Arrays.toString(a.split("2")));
		
		
		System.out.println(x.replace("g", "G"));
		System.out.println(y.replace("D", "d"));
		System.out.println(z.replace("G", "g"));
		System.out.println(a.replace("2", "@"));
		
		System.out.println(x.indexOf("orn"));//6
		System.out.println(x.indexOf("ood"));//1
		System.out.println(x.indexOf("od"));//2
		System.out.println(x.indexOf("ng"));//10
		
		System.out.println(x.indexOf("g"));//0
		System.out.println(x.lastIndexOf("g"));//11
		
		/*
		Good Morning Good Day
		*/
		System.out.println(x.indexOf("o"));//1
		System.out.println(x.lastIndexOf("o"));//6
		

	}

}
