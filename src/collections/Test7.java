package collections;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("John");
		a.add(123.90);
		a.add(10);
		a.add("");
		a.add('A');
		
	for(Object l:a) {
		System.out.println(l);
	}
	}

}
