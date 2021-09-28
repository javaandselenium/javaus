package methods;

public class Test8 {
	int a=1000;
	static double b=90.00;
	String name="John";
	
	
	public static void add() {
		System.out.println(10+90);
	}
	
	public void sub() {
		System.out.println(90-10);
	}
	
	public static void mul() {
		System.out.println(10*20);
	}

	public static void main(String[] args) {
	Test8 t=new Test8();
	System.out.println(t.a);
	System.out.println(Test8.b);
	System.out.println(t.name);
	Test8.add();
	t.sub();
	Test8.mul();
	

	}

}
