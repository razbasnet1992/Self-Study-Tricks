package com.pratice.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
	    ll.add(1, 4);
	    ll.indexOf(3);
	  System.out.println(ll.get(0));
		System.out.println("apple".compareTo("banana"));
		System.out.println(ll);
		//Queue<Integer> l2 = new LinkedList<>();


	}

}
