package constructors;

public class Sub {

	public Sub(int a) {
		System.out.println(a);
	}

	public Sub(int a, int b) {
		this(10);
		System.out.println(a + b);
	}

	public Sub(int a, double b) {
		this(10,30);
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Sub s=new Sub(10,30.00);
	}
}
