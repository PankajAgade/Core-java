package day_Two;

import java.util.Scanner;

public class Squre {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = kb.nextInt();
		
		int sum=0;
		
		for (int i = 1; i <= a; i++) {
			sum=sum+a;
		}
		
		System.out.print(" 		=> "+sum);

	}

}
