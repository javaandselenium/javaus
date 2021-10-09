package interfaceprograms;

public class Child extends Parent1 implements Parent2,Parent3{

	@Override
	public void bike() {
		System.out.println("Parent 2 interfcae");
		
	}

	@Override
	public void cycle() {
		System.out.println("Parent 3 interface");
		
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.bike();
		c.cycle();
	}
	

}
