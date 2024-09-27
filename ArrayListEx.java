package com.listInterfaceDemo;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		//declare
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(null);
		a1.add(100);
		a1.add(200);
		a1.add(300);
		System.out.println(a1);
		System.out.println("Size of list:-"+a1.size());
		a1.remove(2);
		System.out.println(a1);
		//retrivale
		System.out.println(a1.get(2));
		//replace
		a1.set(2, null);
		System.out.println(a1);
		System.out.println(a1.contains(400));
		for(Object o : a1) {
			System.out.println("value of list:-"+0);
		}
		
	}

}
