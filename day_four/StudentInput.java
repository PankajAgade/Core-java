package day_four;

import java.util.Scanner;

public class StudentInput {
	int rollNo;
	String name;
	String addres;
	int mobNo;
	int sub1;
	int sub2;
	int avg;
	
	void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Student Name : ");
		name = kb.next();
		System.out.print("Enter the Student Roll no. : ");
		rollNo = kb.nextInt();
		System.out.print("Enter the Student Addres : ");
		addres = kb.next();
		System.out.print("Enter the Student Mobile no. : ");
		mobNo = kb.nextInt();
		System.out.print("Enter the Student Subject 1 : ");
		sub1 = kb.nextInt();
		System.out.print("Enter the Student Subject 2 : ");
		sub2 = kb.nextInt();
	}
	
	void Average()
	{
		avg = (sub1+sub2)/2 ;
	}
	void showData()
	{
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~ Display Data ~~~~~~~~~~~~~~~~");
		System.out.println("  Student Name : "+name);
		System.out.println("  Student roll no. : "+rollNo);
		System.out.println("  Student Addres : "+addres);
		System.out.println("  Student mobile no. : "+mobNo);
		System.out.println("  Student Subject 1 : "+sub1);
		System.out.println("  Student Subject 2 : "+sub2);
		System.out.println("  Student Average : "+avg);
	}
	
}
