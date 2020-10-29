package day_5_Calculator;

import java.util.Scanner;

public class Calculator_main {

	public static void main(String[] args) {
		double result;
		
		Calculator cal1 = new Calculator();
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the value of num1 : ");
		int x = kb.nextInt();
		System.out.print("Enter the value of num2 : ");
		int y = kb.nextInt();
		
		
		System.out.println("  1.Addition");
		System.out.println("  2.subtraction");
		System.out.println("  3.Multiplication");
		System.out.println("  4.Division");
		System.out.print("    Enter the operation above sequence : ");
		int choice = kb.nextInt();
		
		
		if(choice==1) {
			result = cal1.addition(x, y);
			System.out.println("  "+x+" + "+y+" = "+result);
		}
		else if(choice==2)
		{
			result = cal1.subtraction(x, y);
			System.out.println("  "+x+" - "+y+" = "+result);
		}
		else if(choice==3)
		{
			result = cal1.multiplication(x, y);
			System.out.println("  "+x+" * "+y+" = "+result);
		}
		else if(choice==4)
		{
			result = cal1.division(x, y);
			System.out.println("  "+x+" / "+y+" = "+result);
		}

	}

}
