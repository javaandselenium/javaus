package conditionalStatements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int numb = s.nextInt();
		
		if(numb%2==0) {
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
	}

}
