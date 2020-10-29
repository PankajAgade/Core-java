package practiceOne;
//Write a program to display total Marks and average of 6 subjects.
public class AverageSixSubject {

	public static void main(String[] args) {
		double English = 50;
		double Math = 80;
		double Science = 36;
		double Hindi = 86;
		double History = 70;
		double Marathi = 90;
		
		double sum = English+Math+Science+Hindi+History+Marathi;
		double average = sum/6;
		System.out.println("	Average of Six Subject => "+average);

	}

}
