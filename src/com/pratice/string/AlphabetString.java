package com.pratice.string;


public class AlphabetString {

	public static void main(String[] args) {
		String string = "quick brown fox jumps over the lazy dog";
		System.out.println(checker(string));
		long count = string.toLowerCase().chars().filter(c-> c>='a'&& c<='z').distinct().count();
		
		System.out.println(count);
		
	}
		
		public static boolean checker(String string) {
			int index =0;
		boolean []flags = new boolean[26];
		for(int i =0;i<string.length();i++) {
			if(string.charAt(i)>='a'&&string.charAt(i)<='z') {
				index = string.charAt(i)-'a';
				
			}
			else if(string.charAt(i)>='A'&&string.charAt(i)<='Z') {
				index = string.charAt(i)-'A';
				
			}
			flags[index] = true;
		}
		for(int i =0;i<26;i++) {
			if(!flags[i])
				return false;	
					
			}
		return true;
	}

}
