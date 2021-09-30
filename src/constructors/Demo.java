package constructors;

public class Demo {

	public Demo(int a, int b) {
		System.out.println(a + b);
	}

	public Demo(int a) {
		this(10,30);
		System.out.println(a);
	}

	public Demo(int a, double b) {
		this(20);
		System.out.println(a + b);
	}

	public static void main(String[] args) {
       Demo d=new Demo(10,89.00);
	}

}
