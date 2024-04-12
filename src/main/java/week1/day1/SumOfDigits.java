package week1.day1;

import java.util.Scanner;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();

		// Initialize an integer variable by name: sum
		int sum = 0, remainder, que;

		while(value>0){
			remainder = value % 10;
			sum = sum + remainder;
			que = value/10;
			value = que;
		}

		System.out.println(sum);

		// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0

		// Within loop: get the remainder when done by 10 -> Tip: use mod %

			// Print the remainder to confirm
	
			// Within loop: add that remainder to the sum
	
			// Print the sum to confirm
	
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
	
			// Print the quotient to confirm
		
		// Outside the loop: print the final sum
	}

}