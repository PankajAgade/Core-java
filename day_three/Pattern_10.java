package day_three;
/*
Q.16

1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1 

 */
public class Pattern_10 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				if((i+j)%2==0)
				{
					System.out.print("1 ");
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
