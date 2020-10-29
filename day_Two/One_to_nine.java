package day_Two;

import java.util.Scanner;

public class One_to_nine {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the last no.: ");
		int a = kb.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.println("    => "+i);
		}

	}

}
