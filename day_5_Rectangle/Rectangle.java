package day_5_Rectangle;

public class Rectangle {

	int length;
	int breadth;
	int area;
	
	void area()
	{
		area = length * breadth;
		System.out.println(" Area = > "+area);
	}
	
	Rectangle()
	{
		area();
	}

	public Rectangle(int length, int breadth) {		
		this.length = length;
		this.breadth = breadth;
		area();
	}
	
	Rectangle(int length) {		
		this.length = length;
		this.breadth = length;
		area();
	}
}
