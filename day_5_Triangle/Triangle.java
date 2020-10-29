package day_5_Triangle;

import java.util.Scanner;

public class Triangle {

	int Side1,Side2,Side3,Angle1,Angle2,Angle3;

	Triangle() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of side 1 : ");
		Side1 = kb.nextInt();
		System.out.print("Enter the value of side 2 : ");
		Side2 = kb.nextInt();
		System.out.print("Enter the value of side 3 : ");
		Side3 = kb.nextInt();
		System.out.print("Enter the value of Angle 1 : ");
		Angle1 = kb.nextInt();
		System.out.print("Enter the value of Angle 2 : ");
		Angle2 = kb.nextInt();
		System.out.print("Enter the value of Angle 3 : ");
		Angle3 = kb.nextInt();
	}
	
	void trianglePerimeter() 
	{
		System.out.println();
		int perimeter = Side1 + Side2 + Side3;
		System.out.println("Perimeter of trangle => "+perimeter);
	}
	
	void triangleArea() 
	{
		System.out.println();
		int semiP = (Side1+Side2+Side3)/2;
		double area = Math.sqrt(semiP*(semiP-Side1)*(semiP-Side2)*(semiP-Side3));
		System.out.println("Area of trangle => "+area);
	}
	
	void isosceles() 
	{
		System.out.println();
		if (Side1==Side2 || Side2==Side3 || Side3==Side1 ) {
			System.out.println(" Given trangle is isosceles trangle.");
		} else {
			System.out.println(" Given trangle is non isosceles trangle.");
		}
	}
	
	void equilateral() 
	{
		System.out.println();
		if (Side1==Side2 && Side2==Side3 )
		{
			System.out.println(" Given trangle is equilateral trangle.");
		} else
		{
			System.out.println(" Given trangle is non equilateral trangle.");
		}
	}
	
	void rightAngled()
	{
		System.out.println();
		if ( Angle1==90 || Angle2==90 || Angle3==90 )
		{
			System.out.println(" Given trangle is right Angled trangle.");
		} else
		{
			System.out.println(" Given trangle is non right Angled trangle.");
		}
	}
	
}
