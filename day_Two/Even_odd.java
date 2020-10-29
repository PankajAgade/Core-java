package day_Two;

import java.util.Scanner;

public class Even_odd {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = kb.nextInt();
		
		if (num%2==0) 
		{
			System.out.print("	=> Entered the number is Even.");
		} 
		else {
			System.out.print("	=> Entered the number is Odd.");
		}
		
	}
		
}
