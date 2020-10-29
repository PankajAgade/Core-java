package day_5_shapeCircle;

public class ShapeCircle {
	float pi =3.5f;
	
	ShapeCircle(float radius)
	{
		float area = pi * radius * radius ;
		System.out.println(" Arae => "+area);
	}
	
	ShapeCircle(float radius,float pi)
	{
		float area = pi * radius * radius ;
		System.out.println(" Arae => "+area);
	}
}
