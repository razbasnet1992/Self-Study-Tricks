package com.pratice.pattern;

public class Singleton {
	private static Singleton singleton=null;
	
	private Singleton() {
		
	}
  public static Singleton getInstance() {
	  if(singleton==null) 
		  return new Singleton();
	  else 
		  return singleton;
  }
  public void testMethod() {
	  System.out.println("Singleton Testing");
  }
}
