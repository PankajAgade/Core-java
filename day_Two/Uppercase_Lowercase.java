package day_Two;
//Write a program to display whether a character is an uppercase or lowercase alphabet.
import java.util.Scanner;

public class Uppercase_Lowercase {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a Alphabet : ");
		char ch;
		ch = kb.next().charAt(0);
		
		if (ch >= 97 && ch <= 122)
		{
			System.out.println(" => Given Alphabet "+ch+" is Lowercase.");
		} 
		else if (ch >= 65 && ch <= 90){
			System.out.println(" => Given Alphabet "+ch+" is Uppercase.");			
		}
		else
		{
			System.out.println(" => Entered Value "+ch+" is Not Alphabet.");
		}
	}
}
