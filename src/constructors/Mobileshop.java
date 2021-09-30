package constructors;

public class Mobileshop {
	String name;
	String price;
	String phoneType;
	
	public Mobileshop(String name,String price,String PhoneType) {
		this.name=name;
		this.price=price;
		this.phoneType=PhoneType;
	}
	
	public static void main(String[] args) {
		Mobileshop m=new Mobileshop("Iphone","90888","IOS");
		System.out.println(m.name+ " "+m.price+" "+m.phoneType);
		
	}
	
	
	

}
