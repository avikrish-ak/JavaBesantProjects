package test;

public class SampleI {

	public static void main(String[] args) {
		
	
		for(int a=1;a<=5;a=a+1)
		{
		boolean x=true;
		for(int b=1;b<=a;b=b+1)
		{
			
			if(x)
			{
				System.out.print(a+" ");
				x=false;
			}
			else
			{
				System.out.print(a*a+" ");
				x=true;
			}
				
		}
		System.out.println();
		}
		
	}

}
