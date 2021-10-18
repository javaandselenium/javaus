package exceptionHandling;

import java.io.FileInputStream;

public class Test2 {

	public static void main(String[] args) {
		
		try {
FileInputStream f=new FileInputStream("./D");
		}
		catch(Exception ele) {
			System.out.println("handled");
			System.out.println(ele);
		}
System.out.println("hello");


	}

}
