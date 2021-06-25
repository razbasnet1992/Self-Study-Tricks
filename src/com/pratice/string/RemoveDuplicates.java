package com.pratice.string;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static String removeDups(char c[], int n) {
//String st = "";
		int index=0;
		for(int i=0;i<c.length;i++) {//a,b,a
			int j;
			for(j=0;j<i;j++) { //
				if(c[i]==c[j]) {
					break;
					
				}
			}
			if(j==i) {//a,
				c[index++]=c[i];
			}
			
		}
		return String.valueOf(Arrays.copyOf(c, index));
	}

	public static void main(String[] args) {
		String s1 = "abcfgdf";
		char [] ch = s1.toCharArray();
		String string=removeDups(ch,ch.length);
		System.out.println(string);
       String output = s1.replaceAll("[0-9]","").replaceAll("(.)(?=.*\\1)", "");
       //System.out.println(output);
	}

}
