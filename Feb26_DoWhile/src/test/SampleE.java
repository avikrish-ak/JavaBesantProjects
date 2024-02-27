package test;

import java.util.Scanner;

public class SampleE {

	public static void main(String[] args) {


		System.out.println("Start of Execution...!");
		int a=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter table value... :- ");
		int table=scan.nextInt();
		do
		{
			System.out.print(a);
			System.out.print("x");
			System.out.print(table);
			System.out.print("=");
			System.out.println(a*table);
			a=a+1;
		}while(a <=10);

		System.out.println("End of Execution...!");
		scan.close();
	}

}
