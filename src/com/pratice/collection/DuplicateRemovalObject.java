package com.pratice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateRemovalObject {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"raj","ceo");
        Employee e2 = new Employee(2,"salu","junior");
        Employee e3 = new Employee(3,"raj","junior");
        List<Employee> list = new ArrayList<>();
        Object e5 = new Employee(1,"raj","ceo");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e3);
       // list.add(e5);
        List<Employee> employees = list.stream().distinct().collect(Collectors.toList());
        employees.stream().filter(e->e.getId()>=2).forEach(System.out::println);

        
        System.out.println("============");
        Collections.sort(list,new Name());
        for(Employee obj:list){
            System.out.println(obj.getPosition());
        }
        System.out.println("========");

        HashSet<Employee> hashSet = new HashSet(list);
        for(Employee e:hashSet){
            System.out.println(e.getName());
        }

    }
    static class Name implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getPosition().compareTo(o2.getPosition());
        }
    }
}