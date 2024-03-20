package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SampleB {

	public static void main(String[] args) {
		List<Integer> x = new LinkedList<>();
		List<String> y = new ArrayList<String>();
		List<Integer> z = new Vector<>();
		
		
		x.add(10);//0
		x.add(20);//1
		x.add(50);//2
		
		System.out.println(x);
		
		x.add(1, 30);//1
		
		System.out.println(x);
		
		System.out.println(x.size());

		
		y.add("abbc");//0
		y.add("aaa");//1
		y.add("aaoo");//2
		System.out.println(y);
		
		y.add(0, "abab");//0
		System.out.println(y);
		y.add("aaoo");//4
		System.out.println(y);
		System.out.println(y.size());
		
		System.out.println(x.get(2));//20
		System.out.println(y.get(1));//"abbc"
		
		
		x.set(0, 100);
		System.out.println(x);
		
		
		y.set(4, "bbcc");
		System.out.println(y);
		
		
		
		System.out.println(x.indexOf(40));
		
		System.out.println(x.indexOf(50));
		
		System.out.println(y.indexOf("bbcc"));
		
	}

}
