package test;

import java.util.Arrays;
import java.util.Spliterator.OfInt;

public class SampleA2 {

	public static void main(String[] args) {
		
		int z[] = {1,4,5,2,6,7,23,6,79,10,20};
		int x[] = {1,40,5,20,65,7,223,6,791,10,210,1,4,60};
	
		
		System.out.println(Arrays.toString(z));
		
		Arrays.parallelSort(z);
		System.out.println(Arrays.toString(z));
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, 3, 8);
		System.out.println(Arrays.toString(x));
		
		
		int y[] = new int[20];
		System.out.println(Arrays.toString(y));
		Arrays.fill(y, 123);
		System.out.println(Arrays.toString(y));
		
		
		int[] a= {12, 13 , 14 , 15,17, 18,22,26};
		int[] b = {12, 13 , 14 ,15 ,17 ,18 ,19,21};
		
		
		System.out.println(Arrays.mismatch(a, b));
		
		
		System.out.println(Arrays.compare(a, b));
		System.out.println(Arrays.compare(a, a));
		System.out.println(Arrays.compare(b, a));
		
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println(Arrays.equals(b, b));
		
		int[] a1= {12, 13 , 14 , 15,17, 18,22,26};
		int[]  b1= {12, 13 , 14 ,15 ,17 ,18 ,22,26};
		
		System.out.println(Arrays.equals(a1, b1));
			
		
		int[][] a2= {{22,24},{30,33}};
		
		
		int[][] b2 = {{22,24},{34,33}};
		
		System.out.println(b2[0][0]);
		System.out.println(b2[0][1]);
		System.out.println(b2[1][0]);
		System.out.println(b2[1][1]);
		
		int[][] c2= new int[2][3];
		
		c2[0][0] = 22;
		c2[0][1] = 24;
		c2[0][2] = 26;
		c2[1][0] = 34;
		c2[1][1] = 33;
		c2[1][2] = 56;
		
		System.out.println("#########################");
	
		for(int row=0;row<=1;row=row+1)
		{
			for(int col=0;col<=2;col=col+1)
			{
				System.out.println(c2[row][col]);
			}
		}
		
		
		System.out.println(Arrays.deepEquals(b2, a2));
		
		System.out.println(Arrays.toString(c2));
		for(int[] x2:c2)
		{
			for(int x3:x2)
			{
			System.out.println(x3);
			}
		}

	}

}
