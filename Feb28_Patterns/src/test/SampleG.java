package test;

public class SampleG {

	public static void main(String[] args) {
		
		int count=1;
		for(int a=1;a<=5;a=a+1)
		{
		for(int b=1;b<=a;b=b+1)
		{
			System.out.print(count+" ");
			count=count+1;
		}
		System.out.println();
		}
		
	}

}
