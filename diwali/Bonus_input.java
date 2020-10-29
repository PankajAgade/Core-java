package diwali;

import java.util.Scanner;

public class Bonus_input {

	double sallary ;
	int year;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Sallary : ");
		sallary = kb.nextInt();
		
		System.out.print("Enter the Working Year : ");
		year = kb.nextInt();
	}
	
	double SallaryCalculator()
	{
		double bonus;
		if (year>=5) 
		{
			bonus = 0.35*sallary;
		}
		else 
		{
			bonus = 0.15*sallary;
		}
		
		double Tsallary=bonus+sallary;
		return Tsallary;
	}
}
