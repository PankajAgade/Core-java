package day_Two;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
public class Pattern_7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i-j+1+" ");
			}
			System.out.println();
		}

	}

}
