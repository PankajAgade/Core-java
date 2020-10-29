package day_Two;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = kb.nextLine();
		System.out.print("Enter your Age : ");
		int age = kb.nextInt();
		System.out.print("Enter your mobile no. : ");
		long moNumber = kb.nextLong();
		
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Your Name       : "+name);
		System.out.println("Your Age        : "+age);
		System.out.println("Your Mobile no. : "+moNumber);
	}

}
