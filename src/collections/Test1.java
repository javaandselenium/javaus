package collections;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(90.00);
	v.add(90.00);
	v.add('A');
	v.add('A');
	v.add("");
	v.add(12.09);
	v.add('A');
	v.add(10);
	v.add("");
	v.add(12.09);
	v.add(10);
	v.add(90.00);
	v.add(90.00);
	v.add('A');
	v.add(10);
	v.add("");
	v.add(12.09);
	v.add('A');
	v.add(10);
	v.add("");
	
	
	System.out.println(v.size());
	
	System.out.println("how much data it is stored "+v.capacity());
	
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
	

	}

}
