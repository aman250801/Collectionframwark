package com.hashMapDemo;

import java.util.*;


public class HashMapBookEx {
	
	public static void main(String[] args) {
		HashMap<String,Double> book=new HashMap<>();
		
		book.put("Enlish",450.25);
		book.put("Maths", 300.0);
		book.put("Gk", 299.00);
		book.put("Hindi", 199.00);
		System.out.println("Using put method:="+book);
		
		// Entry convertion
		Set<Map.Entry<String,Double>> s1=book.entrySet();
		
		//using loop
		for(Map.Entry<String,Double> itr:s1) {
			System.out.println("Entry is:-"+itr.getKey()+" "+itr.getValue());
			
			// Change the value of Gk
			
			if(itr.getKey().equals("Gk")) {
				itr.setValue(399.50);
			}
		}
		System.out.println("Update value:-"+book);
		
	}

}
