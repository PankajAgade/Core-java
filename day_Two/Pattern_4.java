package day_Two;

public class Pattern_4 {
	
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9; i=i+2) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= 8; i=i+2) {
			for (int j = 1; j <= 8-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		 
	}
}
