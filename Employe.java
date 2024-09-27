package com.comparableAndCompatorDemo;

public class Employe implements Comparable<Employe>{
	//data
	
	int id;
	String name;
	int sal;
	
	Employe(int id, String name, int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public int compareTo(Employe o) {
		if(sal==o.sal)
		return 0;
		else if(sal>o.sal)
			return 1;
		else
			return -1;
	}
	
	
	
	

}
