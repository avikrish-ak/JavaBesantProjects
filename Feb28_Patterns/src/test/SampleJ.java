package test;

public class SampleJ {

	public static void main(String[] args) {
		
	
		for(int a=1;a<=5;a=a+1)
		{
		
		for(int b=1;b<=a;b=b+1)
		{
			
			if(b%2==1)
			{
				System.out.print(a+" ");
				
			}
			else
			{
				System.out.print(a*a+" ");
				
			}
				
		}
		System.out.println();
		}
		
	}

}
