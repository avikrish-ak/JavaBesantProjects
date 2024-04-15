package test;

public class SampleC2 {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		try {
		System.out.println(a/b);
		}
		finally
		{
			System.out.println("############");
		}
		System.out.println("$$$$$$$$$$$$$$$$$");
		System.out.println(a*b);
		System.out.println("$$$$$$$$$$$$$$$$$");
	}

}
