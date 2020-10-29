package day_6_Square;

import java.util.Scanner;

public class Triangle extends Rectangle {

	int side1,side2,side3;
	
	Triangle()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the side1 : ");
		side1 = kb.nextInt();
		System.out.print("Enter the side2 : ");
		side2 = kb.nextInt();
		System.out.print("Enter the side3 : ");
		side3 = kb.nextInt();
		area(side1,side2,side3);
	}
	void area(int side1,int side2,int side3)
	{
		int semiP = (side1+side2+side3)/2;
		double area = Math.sqrt(semiP*(semiP-side1)*(semiP-side2)*(semiP-side3));
		System.out.println("Area of trangle => "+area);
		
	}
}
