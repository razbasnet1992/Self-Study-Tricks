package com.pratice.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	

		public static void main(String[] args) {
			List<Integer> al = new ArrayList<>();
			al.add(1);
			al.add(2);
			al.add(3);
		    al.add(1, 4);
		    al.remove(0);
		    
		  System.out.println(al.get(0));
		  al.forEach(a->{
			  System.out.println(a);
		  });

}

}