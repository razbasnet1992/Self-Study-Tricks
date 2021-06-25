package com.pratice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

	public static void main(String[] args) {
		String password = "azendra1@";
		String user = "razbasnet.";
		String username = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";

		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}";
		Pattern p = Pattern.compile(pattern);
		
		Matcher m= p.matcher(password);
		boolean flag3 = m.matches();
		boolean flag= Pattern.compile(username).matcher(user).matches();
		
		boolean flag2 = Pattern.compile(pattern).matcher(password).matches();
		if(flag)
			System.out.println("matches");
		else
			System.out.println("false");
		
	}

}
