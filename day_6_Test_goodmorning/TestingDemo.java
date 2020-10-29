package day_6_Test_goodmorning;
/*
Write a program to do the following as per steps:
	a) Create a class Test.
		i. Create a method display1() which prints a message “GOOD MORNING”.
		ii. Create another method display2() which prints a message “GOOD AFTERNOON”.
	
	b) Create new class TestingInheritance which inherits class Test.
		i) Create a method display3() which prints a message “GOOD EVENING”.
	
	c) Create a class TestingDemo
		i) Create object of class TestingInheritance and call all of the methods 
		   inherited from class Test illustrating the concept of inheriting methods 
		   in a class.
 */
public class TestingDemo {

	public static void main(String[] args) {
		
		TestingInheritance obj = new TestingInheritance();
		obj.display1();
		obj.display2();
		obj.display3();
		
	}
	
}
