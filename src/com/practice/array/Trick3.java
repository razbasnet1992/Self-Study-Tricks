package com.practice.array;

public class Trick3 {
  
	public static boolean isSpecial(String text) {
		String tempText = alterText(text);
		return text.equals(tempText);
	}
	
	private static String alterText(String text) {
		if(text==null || text.isEmpty()) {
		return text;
	}
		return text.charAt(text.length()-1)+
				alterText(text.substring(0,text.length()-1));
	}

	public static void main(String[] args) {
		boolean result = isSpecial("rajendra");
		System.out.println(result);
		String s = alterText("raje..,/;;QWAAndra");
		System.out.println(s);
		int count = s.codePointCount(0, 15);
		System.out.println(count);

	}

}
