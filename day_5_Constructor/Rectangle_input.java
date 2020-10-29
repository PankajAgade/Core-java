package day_5_Constructor;

public class Rectangle_input {

	int lenght;
	int width;
	int area;
	int Perimeter;
	Rectangle_input(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}
	
	void rectangleArea()
	{
		area= lenght*width;
		System.out.println(" Area => "+area);
	}
	void rectanglePerimeter()
	{
		Perimeter= (2*lenght)+(2*width);
		System.out.println(" Perimeter => "+Perimeter);
	}

}
