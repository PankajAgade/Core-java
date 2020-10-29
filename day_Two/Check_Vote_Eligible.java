package day_Two;

import java.util.Scanner;

public class Check_Vote_Eligible {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = kb.nextInt();
		
		if (age>=18) {
			if (age == 18) {
				System.out.println("Yes, you can first vote.");
			} else {
				System.out.println("Yes, you can vote.");
			}
		} else {
			System.out.println("No, you can't vote.");
		}
	}

}
