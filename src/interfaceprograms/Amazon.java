package interfaceprograms;

public class Amazon implements Test1{

	@Override
	public void payment() {
		System.out.println("Payment");
		
	}

	@Override
	public void call() {
		System.out.println("calls");
		
	}

	@Override
	public void status() {
	System.out.println("status");
		
	}

	@Override
	public void chats() {
		System.out.println("chats");
		
	}
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.call();
		a.status();
		a.payment();
		a.chats();
	}

}
