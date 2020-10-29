package day_Two;

import java.util.Scanner;

public class Area_retangle {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the value of length : ");
		int length = kb.nextInt();
		
		System.out.print("Enter the value of breath : ");
		int breath = kb.nextInt();
		
		int areaOfRectangle = breath * length ;
		
		System.out.println("Area of Rectangle : "+areaOfRectangle);
		
		
		
	}

}
