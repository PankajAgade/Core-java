package day_three;
//((i+3)/2)-j			for 1st way
/*
1 
2 1 2 
3 2 1 2 3 
4 3 2 1 2 3 4 

Steps

1.Trangle rough print (star)
2.Star pattern 
3.value of n and check 1st column
4.increment and decrement base on condition
*/
public class Pttern_23 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i=i+2)
		{
			int n = ((i+3)/2)-1;
			for (int j = 1; j <= i ; j++)
			{
				System.out.print(n+" "); 
				if (j<=i/2)
				{
					n = n-1;
				}
				else
				{
					n=n+1;
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~ 2nd way~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		for (int i = 1; i <= 4; i++)
		{
			int n = i;
			for (int j = 1; j <= (2*i)-1 ; j++)
			{
				System.out.print(n+" "); 
				if (j<i)
				{
					n = n-1;
				}
				else
				{
					n=n+1;
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~ 3rd way~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i ; j++)
			{
				System.out.print(i-j+1+" "); 				
			}
			
			for (int k = 1; k <= i ; k++)
			{
				System.out.print(k+1+" "); 				
			}
			
			System.out.println();
		}
	}

}
