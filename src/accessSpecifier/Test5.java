package accessSpecifier;

public class Test5 {
	
	protected int a=900;
	
	protected void demo() {
		System.out.println("protected method");
	}
	
	protected Test5() {
		System.out.println("protected constructor");
	}

	public static void main(String[] args) {
	Test5 t=new Test5();
	System.out.println(t.a);
	t.demo();

	}

}
