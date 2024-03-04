package test;

import java.util.Arrays;
import java.util.Spliterator.OfInt;

public class SampleA {

	public static void main(String[] args) {
		
		
		int [] x = new int[10];
		int y[] = new int[20];
		int z[] = {1,4,5,2,6,7,23,6,79,10,20};
		
		
		
		System.out.println(z[1]);
		
		System.out.println(Arrays.toString(z));
		
		Arrays.sort(z);
		System.out.println(Arrays.toString(z));
		
		int[] a= Arrays.copyOf(z, z.length);
		
		System.out.println(Arrays.toString(a));
		
		
		int[] b =  Arrays.copyOfRange(z, 2, 8);
		System.out.println(Arrays.toString(b));
		
		
		int[] c = Arrays.copyOf(a, 20);
		System.out.println(Arrays.toString(c));
		

		int[] d = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(d));
	}

}
