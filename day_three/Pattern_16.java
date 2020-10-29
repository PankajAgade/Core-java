package day_three;
/*

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 */
public class Pattern_16 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= i ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= 7-i ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
