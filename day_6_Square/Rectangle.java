package day_6_Square;

import java.util.Scanner;

public class Rectangle extends Square {

	int length,breadth;
	
	Rectangle()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the length : ");
		length = kb.nextInt();
		System.out.print("Enter the breadth : ");
		breadth = kb.nextInt();
		area(length, breadth);
	}
	void area(int length, int breadth)
	{
		int area = length * breadth;
		System.out.println("Area of rectangle => "+area);
	}
}
