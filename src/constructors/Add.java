package constructors;

public class Add {

	public Add(int a, int b) {
		System.out.println(a + b);
	}

	public Add(int a, double b) {
		System.out.println(a + b);
	}

	public Add(int a, int b, double c) {
		System.out.println(a + b + c);
	}

	public Add(int a, int b, double c, double d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		Add a=new Add(10,20.90);
		Add a1=new Add(10,20);
		Add a2=new Add(10,20,90.00);
		Add a3=new Add(10,20,90.09,80.00);

	}

}
