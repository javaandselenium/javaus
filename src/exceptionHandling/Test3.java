package exceptionHandling;

import java.io.FileInputStream;

public class Test3 {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(Exception e) {
		System.out.println("handled");	
		}
		
		try {
		Thread.sleep(3000);
		}
		catch()
		{
			
		}
		

	}

}
