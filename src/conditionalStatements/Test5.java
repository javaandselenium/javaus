package conditionalStatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if(age<19) {
			System.out.println("teenage");
		}
		else if(age>20 && age<60) {
			System.out.println("adult");
		}
		else
{
	System.out.println("senior citizen");
}
	}

}
