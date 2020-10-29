package day_7_Calculator_inMethod06;

public class Calculator_method_main {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		int sum=obj.CalculateSum(10, 10);
		System.out.println("		 = "+sum);
		
		int Difference=obj.CalculateDifference(20, 5);
		System.out.println("		 = "+Difference);
	}
}
