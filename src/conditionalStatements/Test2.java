package conditionalStatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
         int amt=s.nextInt();
	     
	     if(amt<=500) {
	    	 System.out.println("cannot withdraw");
	     }
	     else
	     {
	    	 System.out.println("can withdraw");
	     }
			

		}

	

}
