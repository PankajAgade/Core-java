package day_Two;
//Write a program to display maximum number and minimum number between two numbers.
import java.util.Scanner;

public class Check_min_max_two_number {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the First number : ");
		int num1 = kb.nextInt();
		
		System.out.print("Enter the Second number : ");
		int num2 = kb.nextInt();
		
		if(num1<num2)
		{
			System.out.println("	=> Entered Second number is Maximum.");
			System.out.println("	=> Entered first number is Minimum.");
		}
		if(num2<num1)
		{
			System.out.println("	=> Entered first number is Maximum.");
			System.out.println("	=> Entered Second number is Minimum.");
		}
		
	}
}
