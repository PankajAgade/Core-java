package day_5_Circle;
/*
Create two methods and calculate area and circumference of a Circle In the Circle.javaclass, create two methods as listed below
a. Method 1 – calculate CircleArea should accept the float radius as parameter and calculate the area (pi*r*r). It should return the result value to the main method where it should be printed in theconsole.
b. Method 2 – calculate Circumference should accept float radius as parameter and calculate the circumference (2 * pi * r). It should return the result value to the main method where it should be printed in the console.
Call these two methods from the main method in Circle.java by passing appropriate parameters.
 */
public class Circle_main {

	public static void main(String[] args) {
		
		Circle obj = new Circle();
		
		System.out.println(" Arae of circle => "+obj.area(5));
		System.out.println(" Arae of circumference => "+obj.circumference(5));

	}

}
