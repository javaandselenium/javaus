package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add("John");
	a.add(123.90);
	a.add(10);
	a.add("");
	a.add('A');
	a.add(10);
	a.add("John");
	a.add(123.90);
	a.add(10);
	a.add("");
	a.add('A');
	
	System.out.println("element stored in arraylist "+a.size());
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	
	
	
	
	}

}
