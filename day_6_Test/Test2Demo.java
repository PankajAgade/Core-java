package day_6_Test;
/*
Create a class Test1 with two instance variables num1 and num2.
Create another class Test2 which is inheriting Test1.
Apart from inheriting class Test1,Test2 declares another variable num3.
Here an object of class Test2 will have the instance variables num1 and num2due 
to the concept of inheritance. 
Within the main() of class Test2Demo create an object of class Test2 and 
assign the values to the instance variables and display them displaying the concept
of inheritance.
 */
public class Test2Demo {

	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		obj.num1 = 5;
		obj.num2 = 10;
		obj.num3 = 15;
		
		System.out.println(" num1 => "+obj.num1);
		System.out.println(" num2 => "+obj.num2);
		System.out.println(" num3 => "+obj.num3);
		
	}

}
