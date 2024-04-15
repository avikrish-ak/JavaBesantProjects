package test;

import java.util.*;

public class SampleA {

	public static void main(String[] args) {
		System.out.println("List O/P");
		List<Integer> x = new LinkedList<>();
		
		x.addAll(Arrays.asList(100,200,300));
		System.out.println(x);
		x.add(0,20);//insert in first index
		System.out.println(x);
		x.add(x.size()-1,400);
		System.out.println(x);
		x.add(500);//insert in last index
		System.out.println(x);
		x.addAll(Arrays.asList(100,200,300));
		System.out.println(x);
		
		System.out.println("Hash Set O/P");
		
		Set<Integer> y = new HashSet<Integer>();
		y.add(20);
		y.addAll(Arrays.asList(100,200,300));
		System.out.println(y);
		y.addAll(Arrays.asList(90,100,30,200,300,60,110,10,30,3,65,7));
		System.out.println(y);
		
		System.out.println("Tree Set O/P");
		Set<Integer> z = new TreeSet<Integer>();
		z.add(20);
		z.addAll(Arrays.asList(100,200,300));
		System.out.println(z);
		z.addAll(Arrays.asList(90,100,30,200,300,60,110,10,30,3,65,7));
		System.out.println(z);
	}
	

}
