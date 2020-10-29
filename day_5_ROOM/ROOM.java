package day_5_ROOM;

import java.util.Scanner;

public class ROOM {

	int length;
	int width;
	int height;
	Scanner kb = new Scanner(System.in);
	ROOM()
	{
		System.out.print("Enter the lenghth of WhiteWash : ");
		length = kb.nextInt();
	
		System.out.print("Enter the Width of WhiteWash : ");
		width = kb.nextInt();
	
		System.out.print("Enter the height of WhiteWash : ");
		height = kb.nextInt();
	}
	
	void whiteWashingArea() 
	{
		int areaWalls = 2*(width*height)+2*(length*height);
		int areaCeiling = length * width;
		
		int areaWhiteWash = areaWalls + areaCeiling;
		
		System.out.println("	Area of WhiteWash => "+areaWhiteWash);
		//return areaWhiteWash;
		whiteWashingCost(areaWhiteWash);
	}
	
	void whiteWashingCost(int areaWhiteWash) 
	{
		int cost =areaWhiteWash * 80 ;
		System.out.println("	Cost of WhiteWash => "+cost);
		flooringCost();
	}
	void flooringCost()
	{
		int x;
		int areaCeiling = length * width;
		System.out.println("	Select option Which floor");
		System.out.println("	1) geometric flooring.");
		System.out.println("	2) cement flooring.");
		System.out.print("		Enter the option : ");
		x = kb.nextInt();
		
		switch (x)
		{
		case 1:
			int flooringCost1 = areaCeiling * 200;
			System.out.print("		Flooring Cost is : "+flooringCost1);
			break;
			
		case 2:
			int flooringCost2 = areaCeiling * 100;
			System.out.print("		Flooring Cost is : "+flooringCost2);
			break;

		default:
			break;
		}
	}
}
