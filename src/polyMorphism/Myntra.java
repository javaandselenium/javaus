package polyMorphism;

public class Myntra extends Ecommerce{
	
	public void shopping() {
		System.out.println("shopping from myntra");
	}
	
	public static void main(String[] args) {
		Ecommerce e=new Flipkart();
		e.shopping();
	}
	
	}