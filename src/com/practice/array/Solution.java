package com.practice.array;

class Solution {
	public static void main(String[] args) {
		String s = solution("aaaabbbbccc");
		System.out.println(s);
	}
    public static String solution(String S) {
    StringBuilder sb = new StringBuilder();
    	for(int i=2;i<S.length();i++) {
    		if(S.charAt(i)==S.charAt(i-1)&& 
    				S.charAt(i-1)==S.charAt(i-2)) {
    			sb.append(S.charAt(i));
    			sb.append(S.charAt(i-1));
    		}
    		sb.append(S.charAt(i));
    	}
    	return sb.toString();
    }
       
}

