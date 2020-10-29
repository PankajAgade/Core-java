package day_Two;

import java.util.Scanner;

//Write a program to display whether a number is negative, positive or zero.
public class Check_positive_negative_zero {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = kb.nextInt();
		
		if (num<0)
		{
			System.out.print("	=> Entered number is negative. ");
		}
		else if(num==0)
		{
			System.out.print("	=> Entered number is zero. ");
		}
		else if(num>0)
		{
			System.out.print("	=> Entered number is Positive. ");
		}
	}

}
