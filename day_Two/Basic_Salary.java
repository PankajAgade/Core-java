package day_Two;

import java.util.Scanner;

/*Write a program to input basic salary of an employee and calculate its Gross 
salary according to following:
Basic Salary <= 10000: HRA = 20%, DA =80% 
Basic Salary <= 20000 : HRA = 25%, DA=90% 
Basic Salary > 20000 : HRA = 30%, DA =95% 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
rough 
20% HRA =  (20*Basic Salary)/100
*/

public class Basic_Salary {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print(" Enter the basic salary : ");
		int basicSalary = kb.nextInt();
		int grossSalary;
		
		if (basicSalary<=10000)
		{
			grossSalary = (int) (basicSalary + (0.2*basicSalary)+ (0.8+basicSalary));
			System.out.println("    Gross Salary => "+grossSalary);
		}
		else if (basicSalary<=20000)
		{
			grossSalary = (int) (basicSalary + (0.25*basicSalary)+ (0.9+basicSalary));
			System.out.println("    Gross Salary => "+grossSalary);
		}
		else if (basicSalary>20000)
		{
			grossSalary = (int) (basicSalary + (0.3*basicSalary)+ (0.95+basicSalary));
			System.out.println("    Gross Salary => "+grossSalary);
		}

	}

}
