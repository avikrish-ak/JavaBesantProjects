package test;

public class SampleF {
	
	int x;
	int y;
	
	SampleF(int a,int b)
	{
	this.x = a;
	this.y= b;
	}
	
	

	public static void main(String[] args) {
		SampleF f= new SampleF(10,20);
		f.cal();

	}
	
	public void cal()
	{
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
	}

}
