package day_four_object_return;

import java.util.Scanner;

public class Demo {

	Student abc()
	{
		Student obj = new Student();
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Roll no. : ");
		obj.rollno = kb.nextInt();
		System.out.print("Enter the Student Name : ");
		obj.name = kb.next();
		return obj;
	}

}
