package day_5_copying_objects;

public class Student {

	int rollno;
	String name;
	Student (int a, String b)
	{
		rollno=a;
		name=b;
	}
	Student (Student X)
	{
		this.rollno=X.rollno;
		this.name=X.name;
	}
}
