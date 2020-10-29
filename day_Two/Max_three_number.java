package day_Two;

import java.util.Scanner;

//Write a program to display maximum among three numbers.
public class Max_three_number {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int firstNumber = kb.nextInt();
		
		System.out.print("Enter the second number : ");
		int secondNumber = kb.nextInt();
		
		System.out.print("Enter the third number : ");
		int thirdNumber = kb.nextInt();
		
		if (firstNumber>secondNumber && firstNumber>thirdNumber) 
		{
			System.out.println("	First Number "+firstNumber+" is Greater.");
		} 
		else if(secondNumber>firstNumber && secondNumber>thirdNumber)
		{
			System.out.println("	Second Number "+secondNumber+" is Greater.");
		}
		else if(thirdNumber>firstNumber && thirdNumber>secondNumber)
		{
			System.out.println("	Third Number "+thirdNumber+" is Greater.");
		}
	}

}
