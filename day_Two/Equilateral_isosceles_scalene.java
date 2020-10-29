package day_Two;

import java.util.Scanner;

public class Equilateral_isosceles_scalene {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of Side one : ");
		int sideOne = kb.nextInt();
		
		System.out.print("Enter the value of Side two : ");
		int sideTwo = kb.nextInt();
		
		System.out.print("Enter the value of Side three : ");
		int sideThree = kb.nextInt();
		
		if(sideOne==sideTwo && sideOne==sideThree)
		{
			System.out.println("=> Given trangle is Equilateral Trangle");
		}
		else if(sideOne==sideTwo || sideOne==sideThree || sideThree==sideThree)
		{
			System.out.println("=> Given trangle is Isosceles Trangle");
		}
		else
		{
			System.out.println("=> Given trangle is Scalene Trangle");
		}

	}

}
