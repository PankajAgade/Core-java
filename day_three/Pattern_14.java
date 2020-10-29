package day_three;
/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

 */
public class Pattern_14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= (6-i); j++) 
			{
				System.out.print(6-j+" ");
			}
			System.out.println();
		}

	}

}
