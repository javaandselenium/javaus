package accessSpecifier;

public class Test0 {
	
	public int a=10;
	
	public void add() {
		System.out.println("public method");
	}
	
	public Test0() {
		System.out.println("public constructor");
	}

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.a);
		t.add();
		
		Test5 t2=new Test5();
		System.out.println(t2.a);
		t2.demo();

	}

}
