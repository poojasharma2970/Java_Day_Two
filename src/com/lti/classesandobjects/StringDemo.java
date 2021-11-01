package com.lti.classesandobjects;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Core";
		s.concat(" Java");
//		s.split(s);
//		System.out.println("String class "+s);
//		
//		StringBuffer sb = new StringBuffer("Core");
//		sb.append(" Java");
//		System.out.println("String Buffer "+sb);
//		
//		StringBuilder sbb = new StringBuilder("Core");
//		sbb.append(" Java");
//		System.out.println("String Builder: "+sbb);
		
		String str = "This is a String, used for String Tokenizer";
		StringTokenizer st = new StringTokenizer(str,",") ;
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
//		String str1 = "This is a String, used for String Tokenizer";
//		StringTokenizer st1 = new StringTokenizer(str) ;
//		while(st1.hasMoreElements()) {
//			System.out.println(st1.nextElement());
//		}
	
	}

}


	
		
		
		
		
	