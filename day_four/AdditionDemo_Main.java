package day_four;

import java.util.Scanner;

/*
Create a class AdditionDemo having 3 instance variables number1 ,number2 and 
result.
	1) Create 4 methods as 
		a) addition
		b) subtraction 
		c) multiplication
		d) division.
	2) Calculate different operations as per the methods determined above. 
	Create objects of AdditionDemo from main method of another class Addition.
*/
public class AdditionDemo_Main {

	public static void main(String[] args) {
		
		AdditionDemo cal1 = new AdditionDemo();
		cal1.input();
		
		System.out.println("  1.Addition");
		System.out.println("  2.subtraction");
		System.out.println("  3.Multiplication");
		System.out.println("  3.Division");
		System.out.print("    Enter the operation above sequence : ");
		Scanner kb = new Scanner(System.in);
		int choice = kb.nextInt();
		
		switch (choice) {
		case 1:
			cal1.addition();
			break;
			
		case 2:
			cal1.subtraction();
			break;
	
		case 3:
			cal1.multiplication();
			break;
	
		case 4:
			cal1.division();
			break;
	
		default:
			break;
		}
		
	}

}
