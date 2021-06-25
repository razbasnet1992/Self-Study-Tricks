package com.pratice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.omg.CORBA.Environment;

public class StudentMain {
	//Environment env = new Environment();

	public static void main(String[] args) {
		Student s1 = new Student(3,"sameer","D");
		Student s2 = new Student(2,"raaz","B");
		Student s3 = new Student(4,"anil","A");
		Student s5 = new Student(3,"anil","B");
		Student s4 = new Student(1,"sameer","C");
		//System.out.println(s1);
		List<Student> students = new ArrayList<>();
		students.add(s3);
		students.add(s2);
		students.add(s1);
		students.add(s5);
		
		students.add(s4);
		students.sort(Comparator.comparing(Student::getName));
		students.forEach(System.out::println);
		System.out.println("=======");
		//s1.setName("Pakuwal");
		
		students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getGrade)
				.thenComparing(Student::getId));
		students.forEach(System.out::println);
        for(Student s:students) {
        	//System.out.println(s);
        }
        System.out.println("==========");
       Set<Student> set = new HashSet<>(students);
       for(Student s:set) {
    	  // System.out.println(s);
       }
       System.out.println("Comparator");
       Collections.sort(students,new Name());
       for(Student s:students) {
    	   System.out.println(s);
       }
       System.out.println("comparable");
       
//       Collections.sort(students);
//       for(Student s:students) {
//    	   System.out.println(s);
//    	   
//       }
       System.out.println("==========");
       
	}
	}


    class Name implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		return o1.getName().compareTo(o2.getName());
				
       }
    }
	


