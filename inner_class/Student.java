package inner_class;

public class Student {
	
	int rollno;
	String name;
	
	void print()
	{
		System.out.println(rollno + name);
	}
	
	class hefshine
	{
		int marks;
		void print2()
		{
			System.out.println(marks +" " + rollno);//instance variavle (rollno) accessable
		}
	}
}
