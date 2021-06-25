package com.pratice.collection;

public class Student{
	private int id;
	private String name;
	private String grade;
	
	public Student(int id, String name, String grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "id "+id+" name "+name+" grade "+grade;
	}
	public String main() {
		return "sam";
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.id>o.id) 
//			return 1;
//		else if(this.id<o.id)
//			return -1;
//		else
//			return 0;
//	}
	

}
