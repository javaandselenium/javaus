package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
	
	public void add() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("./d");
	}
	

	public static void main(String[] args) {
		Test6 t=new Test6();
		try {
		t.add();
		}
		catch(Exception e) {
			
		}
	}

}
