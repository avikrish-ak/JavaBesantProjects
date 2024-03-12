package test;

public class SampleB extends SampleA{

	public static void main(String[] args) {
		SampleB b = new SampleB();
		b.cal(var1, b.var2);
		
		
	}

	@Override
	public void cal(int a, int b)
	{
		System.out.println((a*a*a)+(b*b*b));
		super.cal(super.var2, var1);
	}
}
