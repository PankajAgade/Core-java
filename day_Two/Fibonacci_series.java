package day_Two;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of series: ");
		int a = kb.nextInt();
		
		int p1=0;
		int p2=1;
		int sum=0;
		System.out.println("     => "+p1);
		for(int i=2;i<=a;i++)
		{
			sum=p1+p2;
			System.out.println("     => "+sum);
			p2=p1;
			p1=sum;
			
		}
		

	}

}
