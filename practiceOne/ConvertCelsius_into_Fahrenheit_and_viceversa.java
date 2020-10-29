package practiceOne;
//Write a program to convert Celsius into Fahrenheit and viceversa.
public class ConvertCelsius_into_Fahrenheit_and_viceversa {

	public static void main(String[] args) {
		//(0°C × 9/5) + 32 = 32°F
			int celsius = 0;
			int Fahrenheit = (celsius*(9/5)+32);
			System.out.println("Celsius( "+celsius+" ) => Fahrenheit ( "+Fahrenheit+ ")");
			
			//(0°F − 32) × 5/9 = -17.78°C
			
			celsius = (Fahrenheit - 32)*(5/9);
			System.out.println("Fahrenheit( "+Fahrenheit+" ) => Celsius ( "+celsius+ ")");
	}
	

}
