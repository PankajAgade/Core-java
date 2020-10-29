package day_Two;
/*
1
2 1 2
3 2 1 2 3
4 3 2 1 2 3 4
 */
public class Pattern_9 {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i=i+2) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i-j+1+" ");
			}
			System.out.println();
		}

	}
}
