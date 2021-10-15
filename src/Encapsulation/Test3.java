package Encapsulation;

public class Test3 {
	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.getName());
		
		System.out.println(t.getNumb());
		t.setNumb(67890);
		System.out.println("updated numb "+t.getNumb());
		
		System.out.println(t.getPassword());
		
		
	}

}
