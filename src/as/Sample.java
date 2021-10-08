package as;

import accessSpecifier.Test0;
import accessSpecifier.Test3;
import accessSpecifier.Test4;
import accessSpecifier.Test5;

public class Sample extends Test5{

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.a);
		t.add();
		
		Sample t2=new Sample();
		System.out.println(t2.a);
		t2.demo();

	}

}
