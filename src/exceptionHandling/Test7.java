package exceptionHandling;

import java.io.FileInputStream;

public class Test7 {

	public void demo() {
		try {
		FileInputStream fis=new FileInputStream("./d");
		}
		catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		Test7 t=new Test7();
		t.demo();

	}

}
