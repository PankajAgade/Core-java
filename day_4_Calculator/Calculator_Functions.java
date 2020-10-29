package day_4_Calculator;

import java.util.Scanner;

public class Calculator_Functions {
	
	int number1, number2, result;
	int choice;
	
	void input()
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.print(" Enter the Number 1 = ");
		number1 = kb.nextInt();
		
		System.out.print(" Enter the Number 2 = ");
		number2 = kb.nextInt();
		
	}
	
	
	void addition() {
		result = number1 + number2;
		System.out.println(" "+number1+" + "+number2+" = "+result);
	}
	void subtraction()
	{
		result = number1 - number2;
		System.out.println(" "+number1+" - "+number2+" = "+result);
	}
	void multiplication()
	{
		result = number1 * number2;
		System.out.println(" "+number1+" * "+number2+" = "+result);
	}
		
}
