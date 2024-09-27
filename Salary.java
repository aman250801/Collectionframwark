package com.comparatorInterface;

import java.util.Comparator;

public class Salary implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		if(o1.sal==o2.sal)
		return 0;
		else if(o1.sal>o2.sal)
			return 1;
		else
			return -1;
	}

}
