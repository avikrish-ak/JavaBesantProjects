package test;

public class SampleC {
	
	public int x=10;
	public static int y=20;
	
	

	public static void main(String[] args) {
		System.out.println(y);
		
		SampleC c= new SampleC();
		c.testing();
	}
	
	public void test()
	{
		System.out.println(this.x+y);
	}
	
	
	public void testing()
	{
		this.test();
	}
	
	

}
