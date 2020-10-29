package day_5_Circle;

public class Circle {
	float pi = 3.14f;
	float area(float r)
	{
		float area = pi*r*r; 
		return area;
	}
	
	float circumference(float r)
	{
		float  circumference = 2*pi*r; 
		return circumference;
	}
}
