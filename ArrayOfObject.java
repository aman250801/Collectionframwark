package com.arrayOfObject;

class Employee{
	int id;
	String name;
	int sal;
	
	// Constructor
	Employee(int id, String name, int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	// display
	
	public void display() {
		System.out.println("Employee data:-"+id+" "+name+" "+sal);
	}
}

public class ArrayOfObject {
	public static void main(String[]args) {
		Employee[]arr;
		arr=new Employee[3];
		
		arr[0]=new Employee(101,"aman",25000);
		arr[1]=new Employee(102,"vishal",35000);
		arr[2]=new Employee(103,"aman",28000);
		
		System.out.println("First emp data:-");
		arr[0].display();
		System.out.println("First emp data:-");
		arr[0].display();
		System.out.println("First emp data:-");
		arr[0].display();
	
		
	}
}
