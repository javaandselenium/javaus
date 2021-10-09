package interfaceprograms;



public class Test4 implements Demo{

	@Override
	public void add() {
		System.out.println("Adding");
		
	}
	public static void main(String[] args) {
	
	
	Test4 t=new Test4();
	System.out.println(Demo.a);
	t.add();
	

}
}