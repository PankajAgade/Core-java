package practiceOne;

public class ConvertDays {

	public static void main(String[] args) {
		
		int input = 373;
		
		int year = input/365;
		input = input % 365;
		System.out.println(" Year => "+year);
		
		int weak = input / 7;
		input = input % 7;
		System.out.println(" Weak => "+weak);
		
		System.out.println(" days => "+input);
		

	}

}
