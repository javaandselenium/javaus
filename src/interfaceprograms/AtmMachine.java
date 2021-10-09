package interfaceprograms;

public class AtmMachine implements Test0{

	@Override
	public void card() {
	System.out.println("Insert the card");
		
	}

	@Override
	public void pin() {
	System.out.println("Insert the pin numb");
		
	}

	@Override
	public void amount() {
		System.out.println("Eneter the amount");
	}
	public static void main(String[] args) {
		
	
	AtmMachine a=new AtmMachine();
	a.card();
	a.pin();
	a.amount();
	

	}

}
