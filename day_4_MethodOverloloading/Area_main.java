package day_4_MethodOverloloading;
/*
Write a program to show method overloading by performing following steps:
Create a class to print the area of a square, a rectangle and a triangle. 
The class has3 methods with the same name but different number of parameters. 
The method for printing area of rectangle has two parameters which are length
and breadth respectively, for printing the area of triangle method has 3 
parameters and while the other method for printing area of square has one 
parameter which is side of square.
*/
public class Area_main {
	public static void main(String[] args) {
		
		Area_Class obj = new Area_Class();
		obj.area(2);
		obj.area(10, 20);
		obj.area(0.5, 2, 5);
	}
}
