package day_Two;
//Write a program to input an alphabet and display whether it is a vowel or a consonant.
import java.util.Scanner;

public class Vowel_or_not {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Charecter : ");
		char num = kb.next().charAt(0);
		
		if (num=='a' || num=='e' || num=='i' || num=='o' || num=='u' 
				||num=='A' || num=='E' || num=='I' || num=='O' || num=='U')
		{
			System.out.print("=> Given Alphabet "+num+" is Vowel.");
		} else 
		{
			System.out.print("=> Given Alphabet is "+num+" Consonant.");
		}
	}

}
