package com.pratice.string;

public class VowelConsonantCheck {

	public static void main(String[] args) {
		String string = "rajendra";
		
		string= string.toLowerCase();
		string = string.replaceAll("\\s", "");
		long count = string.toLowerCase().chars().filter(ch->ch>='a'&&ch<='z').distinct().count();
		//System.out.println(count);
		String vowels = "aeiou";
		char [] c = string.toCharArray();
		int vowelCount = 0;
		int conCount =0;
		for(char ch:c) {
			if(vowels.indexOf(ch)!=-1) {
				vowelCount++;
			}
			else if(vowels.indexOf(ch)!=1)
				conCount++;
		}
		System.out.println(vowelCount);
		System.out.println(conCount);
	}
	
	
static boolean checkAlphabet(String str) {
	
	return ((str!=null) 
			&& (!str.isEmpty())
			&&(str.chars().allMatch(Character::isLetter)));
}

  
}
