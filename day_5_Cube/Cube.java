package day_5_Cube;

import java.util.Scanner;

public class Cube {

	int height, width, depth;
	
	void volume()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the height : ");
		height = kb.nextInt();
		System.out.print("Enter the width : ");
		width = kb.nextInt();
		System.out.print("Enter the depth : ");
		depth = kb.nextInt();
		
		int volume = height * width * depth;
		System.out.println(" Volume of cube => "+volume);
	}
}
