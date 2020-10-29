package day_5_Rectangle;
/*
Create a class named 'Rectangle 'with two data members- length and breadth and a method to calculate the area which is 'length*breadth'. The class has three constructors which are:
1 - having no parameter - values of both length and breadth are assigned zero.
2 - Having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - Having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
 */
public class Rectangle_main {

	public static void main(String[] args) {
		

		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(20, 30);
		Rectangle obj3 = new Rectangle(20);
		
	}

}
