package day_three;

public class Pattern_24 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= 7; j++) {
				if(i<=j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 7; j++) {
				if((i+j)>=8)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
