package inhertiance;

public class Father extends GrandFather{
	
	public  void car() {
		System.out.println("car from father");
	}
	
	public static void main(String[] args) {
		Father  a=new Father();
		a.car();
		a.home();
	}

}
