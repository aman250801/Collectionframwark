package com.comparatorInterface;

import java.util.Comparator;

public class Name implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
	    return
		o1.name.compareTo(o2.name);
	}

}
