package day_Two;

public class Pattern_one {
	/*
	WRITE A PROGRAM to print following Pattern
	* * * * *
	* * * *
	* * *
	* *
	*
*/
	public static void main(String[] args) {
		for (int i = 5; i >0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
