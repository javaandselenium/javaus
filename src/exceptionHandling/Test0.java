package exceptionHandling;

public class Test0 {

	public static void main(String[] args) {

		try {
      int i=1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("handled");			
		}

System.out.println("hello");
	}

}
