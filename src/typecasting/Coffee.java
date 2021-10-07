package typecasting;

public class Coffee extends Book {
	
	public void hotCoffee() {
		System.out.println("hotcofee");
	}
	
	public void coldCoffee() {
		System.out.println("coldcofee");
	}
	
	public static void main(String[] args) {
		Book b=new Coffee();
		Coffee c=(Coffee)b;
		c.redbook();
		c.blueBook();
		c.hotCoffee();
		c.coldCoffee();
	}

}
