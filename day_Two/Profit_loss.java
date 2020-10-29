package day_Two;

import java.util.Scanner;

//Write a program to display and calculate profit or loss by a suitable example. 
public class Profit_loss {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		float cp,sp;
		System.out.print("Enter the Cost Price : ");
		cp = kb.nextFloat();
		System.out.print("Enter the Selling Price : ");
		sp = kb.nextFloat();
		
		float amount = sp-cp;
		
		if (amount > 0)
		{
			System.out.print("	=>Profit");
		} 
		else if (amount < 0)
		{
			System.out.print("	=>Loss");
		}
		else if (amount==0)
		{
			System.out.print("	=>No Profit nor Loss");
		}
	}

}
