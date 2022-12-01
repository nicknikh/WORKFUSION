package com.workfusion.learning;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

public class HelloWorld {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int i=13;
		double j=13;
		System.out.println(i);
		System.out.println(j);
		String s1="hari";
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.concat("kumar"));
		
			System.out.println("Hello World");
		try {
			System.out.println(5/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		ArrayList<Integer> l= new ArrayList<Integer>();
//		l.add(2);
//		l.add(1);
//		l.add(3);
//		for(Integer i:l) {
//			System.out.println(i);
//			
//		}
//		Collections.sort(l);
//		System.out.println(l);
//		for(Integer i:l) {
//			System.out.println(i);
//			
//		}
//		
}

}
