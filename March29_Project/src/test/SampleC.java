package test;

public class SampleC {

	public static void main(String[] args) {
	
		int a=10;
		int b=2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		try {
		System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("############");
		}
		System.out.println(a*b);
		

	}

}
