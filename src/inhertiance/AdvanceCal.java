package inhertiance;

public class AdvanceCal  extends BasicCal{
	
	public void coseteta() {
		System.out.println("coseteta");
	}
	
	public void sinteta() {
		System.out.println("sinteta");
	}
	
	public static void main(String[] args) {
		AdvanceCal a=new AdvanceCal();
		a.coseteta();
		a.sinteta();
		a.add(10,20);
		BasicCal.sub(10,7);
		
	}

}
