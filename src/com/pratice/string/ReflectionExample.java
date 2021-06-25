package com.pratice.string;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReflectionExample {
	String name;
	String password;
	int id;
	int code;
	ReflectionExample(){
		
	}
	ReflectionExample(String name){
		
	}
	ReflectionExample(int id,String password){
	
	}
	public static void main(String[] args) {
		Object object = new ReflectionExample();
		Class aClass = ReflectionExample.class;
		System.out.println(aClass.getName());
		//fields declared within the class
		Field[] fields = aClass.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		//System.out.println(aClass.getDeclaredFields());
		
			Constructor[] cons = aClass.getDeclaredConstructors(); //all types of constructors with parameters
			System.out.println(cons);  //
			for(Constructor con:cons) {
				System.out.println(con);
				Class[] parameter = con.getParameterTypes();
				for(Class c:parameter) {
				System.out.println("parameters :"+c);
				}
			}
			String date = new SimpleDateFormat().format(new Date());
			System.out.println(date);
			int types = aClass.getModifiers(); //access modifiers
			System.out.println("Modifiers :"+Modifier.toString(types));
		
		

	}

}
