package com.pratice.string;

public class AlphabetCheck {

	public static void main(String[] args) {
		String string = "a quick brown fox jumps o the lazy dog";
		String st = string.replaceAll(" ", "");
		long c = string.toLowerCase().chars()
			      .filter(ch -> ch >= 'a' && ch <= 'z')
			      .distinct()
			      .count();
		Object ob = new AlphabetCheck();
		
	
		System.out.println(c);
		if(checker(st)) {
			System.out.println("all");
		}
		else
			System.out.println("not");
		
	}
		
		public static boolean checker(String st) {
			boolean[] check = new boolean[26];
			int index=0;
		
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				index= st.charAt(i)-'a';

			}
			check[index]=true;
		}
		
		for(int i=0;i<check.length;i++) {
		if(!check[i]) 
			return false;
		
		}
			return true;
		}
	
}
