package day_5_Constructor;
/*
Create a class Rectangle with two instance variables: length and width. 
Create a constructor initialing the instance variables.Subsequently, 
two objects of this class are created and then the methods rectangleArea() 
and rectanglePerimeter() are invoked.
 */
public class Constractor_main {

	public static void main(String[] args) {
		
		Rectangle_input r1 = new Rectangle_input(5, 10);
		r1.rectangleArea();
		r1.rectanglePerimeter();
		
		Rectangle_input r2 = new Rectangle_input(20, 10);
		r2.rectangleArea();
		r2.rectanglePerimeter();

	}

}
