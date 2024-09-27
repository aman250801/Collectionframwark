package com.hashMapDemo;

import java.util.HashMap;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hs=new HashMap<>();
		
		hs.put(1, "Aman");
		hs.put(2, null);
		hs.put(3,"Vishal");
		hs.put(4, "jaddu");
		hs.put(5, "Abhi");
		System.out.println("Using put method:-"+hs);
		hs.get(2);
		System.out.println("Using get method:-"+hs);
		
		hs.remove(3);
		System.out.println("using remove method:-"+hs);
		
		System.out.println(hs.containsKey(1));
		
		System.out.println(hs.containsValue(3));
		
		hs.isEmpty();
		System.out.println(hs);
		
		hs.size();
		System.out.println("Size:-"+hs);
		
		hs.clear();
		System.out.println("using clear method:-"+hs);
		
		//entry set
		System.out.println(hs.keySet());
		
		
	}
	

}
