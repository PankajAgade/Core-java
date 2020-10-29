package day_three;
/*
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

*/

public class Pattern_22 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i=i+2)
		{
			
			for (int k = 1; k <= 9-i ; k++)
			{
				System.out.print(" ");
			}
			
			int n=1;
			for (int j = 1; j <= i ; j++)
			{
				System.out.print(n+" ");
				if(j<=i/2)
				{
					n=n+1;
				}
				else
				{ 
					n=n-1;
				}
			}
			System.out.println();
		}

	}

}
