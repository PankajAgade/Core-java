package day_4_MethodOverloloading;

public class Area_Class {

	void area(int a)
	{
		int area = a*a;
		System.out.println("Area of Square = "+area);
	}
	void area(int l, int b)
	{
		int area = l*b;
		System.out.println("Area of Rectangle = "+area);
	}
	void area(double c, double h, double b)
	{
		double area = c*h*b;
		System.out.println("Area of Trangle = "+area);
	}
	
}
