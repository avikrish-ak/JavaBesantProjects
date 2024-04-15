package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleA2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> x = new LinkedList<>();
		
		Integer[] y = {10,20,30,50,80,120,33,65,60};
		
		x.addAll(Arrays.asList(y));
		
		System.out.println(x);
		
		
		System.out.println(x.contains(120));//true
		
		System.out.println(x.contains(123));//false
		
		System.out.println(x.containsAll(Arrays.asList(30,50,120)));//true
		
		System.out.println(x.containsAll(Arrays.asList(10,20,130)));//false
		
		LinkedList<Integer> z = new LinkedList<Integer>();
		
		z = (LinkedList) x.clone();
		
		System.out.println(z);
		
		
		System.out.println(x.equals(Arrays.asList(10,20,30,50,80)));//false
		
		System.out.println(x.equals(z));//true
		
		x.add(3333);
		
		System.out.println(x);
		System.out.println(z);
		
		System.out.println(x.equals(z));//false
		

	}

}
