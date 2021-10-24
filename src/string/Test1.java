package string;

public class Test1 {

	public static void main(String[] args) {
		String s="SELENIUM";
		System.out.println("before reverseing "+s);
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}

	}

}
