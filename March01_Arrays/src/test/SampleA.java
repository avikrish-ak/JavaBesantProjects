package test;

public class SampleA {

	public static void main(String[] args) {
	int x[] = new int[101];
	
	x[0] = 200;
	x[99]= 45;
	
	System.out.println(x[0]);
	System.out.println(x[99]);
	
	System.out.println(x[22]);
	
	
	x[0] = 25252;
	
	System.out.println(x[0]);
	
	System.out.println(x[100]);
	
	double a[] = new double[5];
	
	a[1]=2.3;
	a[2]= 4.5;
	a[0] = 2.6;
	a[4] =65.6;
	a[3] = 3.56;
	
	int index=0;
	System.out.println("While loop..!");
	while(index<5)
	{
		System.out.println(a[index]);
		index=index+1;
	}
	
	System.out.println("For loop");
	for(int i=0;i<5;i=i+1)
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
