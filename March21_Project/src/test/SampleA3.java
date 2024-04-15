package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleA3 {

	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<Integer>();
		
		
		System.out.println(x.size());//0
		
		x.addAll(Arrays.asList(100,200,300,400));
		x.addAll(3,Arrays.asList(4000,6000,8000));
		System.out.println(x);//7
		
		System.out.println(x.size());
		System.out.println(x.contains(300));//true
		System.out.println(x.contains(3000));//false
		
		System.out.println(x.containsAll(Arrays.asList(300,200,4000)));//true
		System.out.println(x.containsAll(Arrays.asList(3020,200,4000)));//false
		
		
		System.out.println(x.equals(Arrays.asList(100, 200, 300, 4000, 6000, 8000, 400)));//true
		System.out.println(x.equals(Arrays.asList(100, 200, 300, 4000, 6000)));//false
		
		System.out.println(x.isEmpty());//false
		x.clear();
		System.out.println(x);
		
		System.out.println(x.isEmpty());//true
		
		System.out.println(x.size());//0
		
	}

}
