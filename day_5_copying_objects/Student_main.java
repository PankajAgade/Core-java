package day_5_copying_objects;

public class Student_main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "abc");
		Student s2 = new Student(1, "abc");
		System.out.println(s1.rollno+s1.name);
		System.out.println(s2.rollno+s2.name);
		s2=s1;
		
		s1.rollno = 50;
		System.out.println(s1.rollno+s1.name);
		System.out.println(s2.rollno+s2.name);
		
		//Another way to copy
		
		Student s3 = new Student(2, "xyzn");
		Student s4 = s3;
		System.out.println(s3.rollno+s3.name);
		System.out.println(s4.rollno+s4.name);
		
		s3.rollno = 50;
		System.out.println(s3.rollno+s3.name);
		System.out.println(s4.rollno+s4.name);
		
		//Another way to copy
		
		Student s5 = new Student(3, "abcjv");
		Student s6 = new Student(s5);
		System.out.println(s5.rollno+s5.name);
		System.out.println(s6.rollno+s6.name);
	}

}
