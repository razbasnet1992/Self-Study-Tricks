package com.pratice.string;

public class StringRegrex {

	public static void main(String[] args) {

		String string = "rasstarffge";
		int count = 0;
		int count1 = 0;
		StringBuilder strBuilder = new StringBuilder(string);
//		String s = strBuilder.reverse().toString();
//		if(string.equals(s))
//			System.out.println("anagram");
//		else
//			System.out.println("not");
		String[] st = new String[string.length()];
		
		for (int i = 0; i < string.length() - 2; i++) {
			st[i] = string.substring(i, i + 3);

			System.out.println(st[i]);

			for (int j = 0; j < st[i].length(); j++) {
				if (check(st[i].charAt(j))) {
					count++;

				} 
				
			}
		
		}
		System.out.println(count1);
		System.out.println(count);
	}

	static boolean check(char c) {
		boolean flag = false;
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			flag = true;
		else
			flag = false;
		return flag;
	}
}
