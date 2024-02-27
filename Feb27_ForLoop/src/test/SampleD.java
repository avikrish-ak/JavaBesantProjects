package test;

public class SampleD {

	public static void main(String[] args) {
		
		long a=0;
		long b=1;
		long c;
			
		int x=1;
		while(x<=50)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			x=x+1;
		}
		

	}

}
