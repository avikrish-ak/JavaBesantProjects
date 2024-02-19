package testA;

public class SampleD {

	public static void main(String[] args) {
		main();
		main(10,20,30,4.5,5.6f,true);
	}
	
	public static void main()
	{
		System.out.println("Main Method");
	}
	
	public static void main(int u, int v, long w, double x, float y, boolean z)
	{
		System.out.println(u+v+w+x+y);
		System.out.println(z);
	}
}


