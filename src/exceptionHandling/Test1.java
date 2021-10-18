package exceptionHandling;

public class Test1 {

	public static void main(String[] args) {
	int a[]= {10,20,30,40};
	
	try {
	System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("handled");
	}

	System.out.println("hello");
	}

}
