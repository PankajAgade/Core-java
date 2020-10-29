package day_5_test;

import java.util.Scanner;

public class Test {
	int num;
	Test()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		this.num = kb.nextInt();
	}
	
	void Even_Odd()
	{
		if(num%2==0)
		{
			System.out.println(" Given number "+num+" is Even.");
		}
		else
		{
			System.out.println(" Given number "+num+" is Even.");
		}
		Factorial();
	}
	
	void Factorial()
	{
		int fact=1;
		int i=1;
		do {
			fact=fact*i;
		} while (i<=num);
		System.out.println(" Given number "+num+" factor : "+fact);
		sum_digits();
	}
	void sum_digits()
	{
		int sum=0;
		int temp;
		while (num>0) {
			temp = num % 10;
			sum = sum + temp;
			num = num / 10;
		}
		System.out.println(" Given number "+num+" sum of all digits : "+sum);
	}

}
