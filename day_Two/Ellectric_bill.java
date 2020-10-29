package day_Two;

/*
Consider a situation below of the electricity unit charges. Now input electric units
 by the user and calculate total electricity bill according to the given condition.
For first 50 units Rs. 0.50/unit 
For next 100 units Rs.0.75/unit 
For next 100 units Rs. 1.20/unit 
For unit above 250 Rs.1.50/unit
An additional surcharge of 20% is added to the bill
 */
import java.util.Scanner;

public class Ellectric_bill {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Unit : ");
		double unit = kb.nextDouble();
		double bill;
		
		if (unit <= 50) {
			bill =50*0.5;
		} 
		else if(unit <= 150) {
			bill =(50*0.5) + ((unit-50)*0.75);
		}
		else if(unit <= 250) {
			bill =(50*0.5) + (100*0.75) +((unit-150)*1.2);
		}
		else {
			
			bill =(50*0.5) + (100*0.75) + (100*1.2) +((unit-250)*1.5);
		}
		
		double finalBill = (bill*0.2)+bill;
		
		System.out.println("    final Bill => "+finalBill);
	}
	

}
