package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleA {

	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<Integer>();
		
		x.add(10);//0
		x.add(30);//1
		System.out.println(x);
		x.addFirst(20);//0 insert value in first place
		System.out.println(x);
		x.addLast(40);// insert value in last place
		System.out.println(x);
		x.add(1,123);//index 
		System.out.println(x);
		x.addAll(Arrays.asList(100,200,300,400));
		System.out.println(x);
		x.addAll(3,Arrays.asList(4000,6000,8000));
		System.out.println(x);
		
		x.remove();
		System.out.println(x);
		x.removeFirst();
		System.out.println(x);
		x.removeLast();
		System.out.println(x);
		x.addAll(3,Arrays.asList(40,10,80));
		System.out.println(x);
		
		x.removeFirstOccurrence(40);
		System.out.println(x);
		
		x.removeLastOccurrence(10);
		System.out.println(x);
		
		x.removeAll(Arrays.asList(200,80,300));
		System.out.println(x);
		
		x.remove(3);
		System.out.println(x);
	}

}
