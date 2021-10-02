package conditionalStatements;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weather");
		int weather = 'B';
		
		switch(weather) {
		case 'A':
			System.out.println("Summer");
			break;
		case 'B':
			System.out.println("rainy");
			break;
		case 'C':
			System.out.println("winter");
			break;
		case 'D':
			System.out.println("spring");
			break;
		case 'E':
			System.out.println("cloudy");
			break;
			default:
				System.out.println("invalid input");
		}

	}

}
