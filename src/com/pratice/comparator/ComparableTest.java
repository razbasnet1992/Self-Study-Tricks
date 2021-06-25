package com.pratice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"raj","woodside"));
		list.add(new Student(9,"salu","elmhurst"));
		list.add(new Student(5,"khusi","corona"));

		Comparator<Student> students =(o1,o2)->(o1.getId()>o2.getId())?1:-1;
		//System.out.println(students);
		//students.
		//Collections.sort(students);
		
		//System.out.println(students);
	list.sort(Comparator.comparing(Student::getId));
		Comparator<Student> s = new Comparator<Student>() {
			
			public int compare(Student s1,Student s2) {
				return new Integer(s1.getId()).compareTo(new Integer(s2.getId()));
			}
		};
//		
//	Collections.sort(list,s);
//		
//		for(Student st:list) {
//			System.out.println(st);
//		}
	//	Collections.sort(list)
		list.forEach(value -> System.out.print(value.getId()));
//		
//		System.out.println("============");
//		for(Student sg:list) {
//			System.out.println(sg);
//		}
	}

}
