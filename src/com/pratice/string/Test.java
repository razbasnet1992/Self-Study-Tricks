package com.pratice.string;

public class Test {

	public static void main(String[] args) {
		int a3=500;
		int a4=500;
		Integer a1 =500;
	
		//Integer a2=500;
		//System.out.println(a1==a2);
		//System.out.println(a3==a4);
		Integer obj = new Integer(500);
	   Long.valueOf(a4);
		
		//System.out.println(100+100+"raj"); //200raj
		//System.out.println("raj"+100+100); //raj100100
		
		String string = new String("rajendra");
		String st = new String("rajendra");
		System.out.println(string==st); //false
		String s4 = st.intern();
	
		String s = "rajendra";
		System.out.println(s==s4); //true
		String str= "rajendra";
		System.out.println(s==str); //true
		
		
		//System.out.println(s==st);
		
	}

}
