package day_Two;

/*
Write a program to print following Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

(i*(i-1)/2)+j
 */
public class Pattern_8 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int o=(i*(i-1)/2)+j;
				System.out.print(o+" ");
			}
			System.out.println();
		}

	}

}
