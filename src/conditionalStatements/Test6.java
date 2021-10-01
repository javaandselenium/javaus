package conditionalStatements;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		
		if(marks>80 && marks<=100) {
			System.out.println("A+");
		}
		else if(marks>60 && marks<=80) {
			System.out.println("A");
		}
		else if(marks>40 && marks<=60) {
			System.out.println("B+");
		}
		else if(marks>20 && marks<=40) {
			System.out.println("B");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
