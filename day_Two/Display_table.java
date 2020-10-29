package day_Two;
//Write a program to display table of a number.
import java.util.Scanner;

public class Display_table {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of table : ");
		int num = kb.nextInt();
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.println("     "+num+"  *  "+i+"  =  "+i*num);
		}
		
				

	}

}
