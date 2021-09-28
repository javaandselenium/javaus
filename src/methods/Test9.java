package methods;

public class Test9 {
	
	static int r=5;
	static double pi=3.142;
	
	public static void areacircle() {
		double area = pi*r*r;
		System.out.println(area);
	}
	
	public  void area1() {
		int r=10;
		double pi=3.142;
		double area=pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Test9.areacircle();
		Test9 t=new Test9();
		t.area1();

	}

}
