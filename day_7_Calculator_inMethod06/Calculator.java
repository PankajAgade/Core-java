package day_7_Calculator_inMethod06;

public class Calculator {

	int CalculateSum(int num1,int num2)
	{
		int number1 = num1;
		int number2 = num2;
		int sum = number1+number2;
		System.out.println("Calculates the sum of two number : ");
		
		return sum;
	}
	int CalculateDifference(int num1,int num2)
	{
		int number1 = num1;
		int number2 = num2;
		int difference = number1-number2;
		System.out.println("Calculates the difference between two number : ");
		return difference;
	}
}
