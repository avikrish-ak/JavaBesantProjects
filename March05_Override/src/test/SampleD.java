package test;

public class SampleD {
	
	public SampleD()
	{
		System.out.println("Test");
	}
	
	
	private SampleD(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		SampleD d  = new SampleD(5,6);
		d.test();
		SampleD d1= new SampleD();
	}

	
	public void test()
	{
		System.out.println("Method..!");
	}
}
