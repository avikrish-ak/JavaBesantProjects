package test;

public class SampleA3 {

	public static void main(String[] args) {
	
	double a[] = {1.2,2.3,3.4,4.56,6.7};

	int index=0;
	System.out.println("While loop..!");
	while(index<a.length)
	{
		System.out.println(a[index]);
		index=index+1;
	}
	
	System.out.println("For loop");
	for(int i=0;i<a.length;i=i+1)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("For each loop");
	for(double b:a)
	{
		System.out.println(b);
	}
	
	
	}

}
