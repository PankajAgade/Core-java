package day_three;
/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
 */
public class Pattern_15 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 7-i; j++)
			{
				System.out.print("1");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~ 2nd way~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 7; j++)
			{
				if((i+j)<8)
				{
					System.out.print(1);
				}
				else 
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
