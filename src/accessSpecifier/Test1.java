package accessSpecifier;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.a);
		t.add();
		
		Test4 t4=new Test4();
		System.out.println(t4.a);
		t4.demo();
	}

}
