package day_5_innerClass_College;
/*
Write a program to demonstrate different types of Inner Classes. 
Create class College as a Outer Class and Department as a Inner Class. 
Use appropriate Variables and Methods.
 */
public class Main_CLass {

	public static void main(String[] args) {
		
		College obj1 = new College();
		obj1.printcollege();
		
		College.Department obj2 = obj1.new Department();
		obj2.IT_Depatment();
	}

}
