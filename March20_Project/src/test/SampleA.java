package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleA {

	public static void main(String[] args) {
		
		List<Integer> x = new LinkedList<>();
		
		Integer[] y = {10,20,30,50,80,120,33,65,60};
		
		x.addAll(Arrays.asList(y));
		
		System.out.println(x);
		
		
		x.remove(3);//only index
		
		System.out.println(x);
		
		
		List<String> a= new LinkedList<String>();
		
		a.add("aa");
		a.add("bb");
		a.add("cc");
		a.add("dd");
		
		System.out.println(a);
		
		
		a.remove("bb");//value
		
		System.out.println(a);
		
		a.remove(1);// index
		
		System.out.println(a);
		
		x.removeAll(Arrays.asList(80,30,20,7865));
		
		
		System.out.println(x);
		
		
		a.removeAll(Arrays.asList("dd"));
		
		System.out.println(a);
		
		
		System.out.println(x.isEmpty());//false
		
		x.clear();
		
		
		System.out.println(x);
		
		
		System.out.println(x.isEmpty());//true
		
		
		
		
		
		

	}

}
