package methods;

public class Test4 {
	
	static String name="Ramesh";
	static int acctBalance=1000;
	static int withdrawal=500;
	
	
	public static void balanceamt() {
		int balance=acctBalance-withdrawal;
		System.out.println(balance);
	}
	

	public static void main(String[] args) {
		balanceamt();


	}

}
