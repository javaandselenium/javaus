package exceptionHandling;

public class Test5 {
	public void add() {
		System.out.println(10+30);
	}
	
	public void dataBase() {
		System.out.println("close the database");
	}

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
	
//		catch(Exception e) {
//		System.out.println("handled");	
//		}
		finally {
			Test5 t=new Test5();
			t.dataBase();
			t.add();
		}
//		Test5 t=new Test5();
//		t.add();
		
		

	}

}
