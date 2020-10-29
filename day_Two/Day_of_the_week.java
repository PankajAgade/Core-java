package day_Two;

import java.util.Scanner;

public class Day_of_the_week {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = kb.nextInt();
		
		if (num>=1 && num<=7)
		{
			if (num == 1) 
			{
				System.out.println("   => Monday");
			}
			else if(num == 2)
			{
				System.out.println("   => Tuesday");
			}
			else if(num == 3)
			{
				System.out.println("   => Wenesday");
			}
			else if(num == 4)
			{
				System.out.println("   => Thursday");
			}
			else if(num == 5)
			{
				System.out.println("   => Friday");
			}
			else if(num == 6)
			{
				System.out.println("   => Saturday");
			}
			else if(num == 7)
			{
				System.out.println("   => Sunday");
			}
			
		} 
		else 
		{
			System.out.println("Invalid number");
		}
		
	}
}
