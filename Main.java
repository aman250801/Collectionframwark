package com.comparatorInterface;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String [] args) {
		
		//arraylist
		ArrayList<Employe> e1=new ArrayList<>();
		e1.add(new Employe(45000,"aman"));
		e1.add(new Employe(30000,"vishal"));
		
		e1.add(new Employe(40000,"jaddu"));
		
		//sorting as per sal
		Collections.sort(e1,new Salary());
		System.out.println("Sorting data by salary:-");
		// for etch
		for(Employe obj:e1){
			System.out.println(obj.sal+" "+obj.name);
		}
			
			//multiple
			
			Collections.sort(e1,new Name());
			System.out.println("Sorting by data name:-");
			for(Employe obj1:e1) {
				System.out.println(obj1.sal+" "+obj1.name);
				
			}
			
			
		}
		
		
	}


