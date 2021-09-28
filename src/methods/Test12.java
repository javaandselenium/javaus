package methods;

public class Test12 {

	public static void send(int numb, String msg) {
		System.out.println(numb + msg);
	}

	public static void send(String msg, String document) {
		System.out.println(msg + document);
	}

	public static void send(double sal, String location, String photo) {
		System.out.println(sal + location + photo);
	}

	public static void main(int a) {
System.out.println(a);
	}

	public static void main(int a,double b) {
System.out.println(a+b);
	}

	public static void main(int a,int b) {
System.out.println(a+b);
	}

	public static void main(String[] args) {
		Test12.send("heello", "Voterid");
		Test12.send(1233, "Gm");
	    Test12.main(10,20);
	    Test12.main(70);

	}

}
