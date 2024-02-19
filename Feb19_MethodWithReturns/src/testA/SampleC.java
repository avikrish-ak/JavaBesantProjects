package testA;

public class SampleC {

	public static void main(String[] args) {
		add(1,2);
		add(0.1,0.3);
		add(1,2,3);
		add(0.5,0.8,0.6);
	}
	
	
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	public static void add(double a, double b,double c)
	{
		System.out.println(a+b+c);
	}
	
	public static void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a, double b,long c)
	{
		System.out.println(a+b+c);
	}
	
}
