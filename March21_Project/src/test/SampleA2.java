package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleA2 {

	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<Integer>();
		
		
		System.out.println(x.size());//0
		
		x.addAll(Arrays.asList(100,200,300,400));
		x.addAll(3,Arrays.asList(4000,6000,8000));
		System.out.println(x);//7
		
		x.offer(200);
		System.out.println(x);
		
		x.offerFirst(1000);
		System.out.println(x);
		
		x.offerLast(4000);
		System.out.println(x);
		
		System.out.println(x.get(3));//300
		
		System.out.println(x.getFirst());
		
		System.out.println(x.getLast());
		
		System.out.println(x.peek());
		
		System.out.println(x.peekFirst());
		
		System.out.println(x.peekLast());
		
		
		System.out.println(x.poll());//get first value in list  and remove
		System.out.println(x);
		
		System.out.println(x.pollFirst());
		System.out.println(x);
		
		System.out.println(x.pollLast());
		System.out.println(x);
		
		x.pop();//remove a value in list 
		System.out.println(x);
		
		x.push(1234);
		System.out.println(x);
		
		
		
	}

}
