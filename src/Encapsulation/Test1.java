package Encapsulation;

public class Test1 {

	public static void main(String[] args) {
	Test0 t=new Test0();
	System.out.println(t.getName());
	
	System.out.println("before updateing "+t.getEmail());
	t.setEmail("demo@gmail.com");
	System.out.println("after updateing "+t.getEmail());
	
	System.out.println(t.getAcctNo());
	
	System.out.println(t.getNumb());
	t.setNumb(987654321);
	System.out.println("after updateing numb "+t.getNumb());
	
	
	}

}
