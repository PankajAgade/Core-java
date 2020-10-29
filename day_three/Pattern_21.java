package day_three;
/*
0 0 0 0 0 0 0 
0 1 0 0 0 0 0 
0 0 2 0 0 0 0 
0 0 0 3 0 0 0 
0 0 0 0 4 0 0 
0 0 0 0 0 5 0 
0 0 0 0 0 0 6 
*/
public class Pattern_21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 7; j++) 
			{
				if(i==j)
				{
					System.out.print(i-1+" ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
