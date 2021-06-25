package com.practice.array;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


import com.pratice.collection.Employee;

public class DuplicateRemovalObject {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"raj","ceo");
        Employee e2 = new Employee(3,"salu","ceo");
        Employee e3 = new Employee(2,"raj","junior");
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        HashSet<Employee> hashSet = new HashSet<Employee>(list);
       for(Employee e:hashSet){
           System.out.println(e.getName());
       }
    }
}
