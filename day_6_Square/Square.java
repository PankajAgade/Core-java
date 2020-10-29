package day_6_Square;

import java.util.Scanner;

public class Square {

	int side;
	Square()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the side : ");
		side = kb.nextInt();
		area(side);
	}
	void area(int side)
	{
		int area = side * side;
		System.out.println("Area of Square => "+area);
	}
	
}
