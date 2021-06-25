package com.pratice.string;

public class ShortName {

	public static void main(String[] args) {
		String s = " Rajendra Basnet  ";
		String st =s.trim();
		System.out.println(st);

		
		String [] words = st.split("\\s+");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i].charAt(0));
			System.out.print(". ");
		}
		System.out.println(words[words.length-1]);
	}

}
