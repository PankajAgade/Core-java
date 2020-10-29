package day_Two;
//Write a program to display 1 to 10 by implementing different loops.
public class Ptint_1_to_10_diff_loops {

	public static void main(String[] args) {

		System.out.println("Print Using for loop : ");
		for (int i = 1; i <= 10 ; i++) {
			System.out.println("   => "+i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Print Using While loop : ");
		int j=1;
		while (j<=10) {
			System.out.println("   => "+j);
			j++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Print Using doWhile loop : ");
		int k=1;
		do {
			System.out.println("   => "+k);
			k++;
		} while (k<=10);
		
	}

}
