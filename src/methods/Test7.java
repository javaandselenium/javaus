package methods;

public class Test7 {

	static int a = 100;
	int b = 200;

	public static void demo() {
		System.out.println("hello");
	}

	public void sample() {
		System.out.println("bye");
	}

	public static void main(String[] args) {
		System.out.println(Test7.a);
		Test7 t = new Test7();
		System.out.println(t.b);
		Test7.demo();
		t.sample();

	}

}
