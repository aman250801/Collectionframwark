package com.iteratoeEx;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("PHP");
		list.add("js");		
		//iterator interface
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		// entry set
		System.out.println(list.keySet());
		
	}

}
