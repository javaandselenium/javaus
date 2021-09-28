package methods;

public class Test11 {

	public void add(int a,int b) {
     System.out.println(a+b);
	}

	public void add(int a,double b) {
     System.out.println(a+b);
	}

	public void add(int a,int b,double c) {
     System.out.println(a+b+c);
	}

	public void add(double a,int b,int c) {
		System.out.println(a+b+c);

	}

	public static void main(String[] args) {
		Test11 t=new Test11();
		t.add(10,20.90);
		t.add(30.00,10,80);

	}

}
