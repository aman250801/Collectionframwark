package com.comparableAndCompatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Employe> e1 = new ArrayList<Employe>();
		
		//add
		e1.add(new Employe(101,"Aman", 55000));
		e1.add(new Employe(101,"Vishal", 35000));
		e1.add(new Employe(101,"Jaddu", 45000));
		
		//sorting
		Collections.sort(e1);
		
		for(Employe obj :e1) {
			System.out.println(obj.id+" "+obj.name+" "+obj.sal);
		}
 	}

}
