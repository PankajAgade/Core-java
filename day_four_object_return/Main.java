package day_four_object_return;

public class Main {

	public static void main(String[] args) {
		
		Demo xyz = new Demo();
		Student q = xyz.abc();
		
		System.out.println(" Student roll no. = "+q.rollno);
		System.out.println(" Student Name = "+q.name);
		

	}

}
