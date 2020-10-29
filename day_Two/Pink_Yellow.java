package day_Two;

/*
Write a program which prints 33 to 999. The numbers should be displayed as:
i. For multiples of 3 print "PINK" instead of the number
ii. For the multiples of five print "YELLOW".
iii. For numbers which are multiples of both three and five print "PINK &YELLOW".
Also print count of how many times “PINK” was printed, “YELLOW” was printed
 and “PINK & YELLOW “was printed.
 */
public class Pink_Yellow {

	public static void main(String[] args) {
		int pink=0,yellow=0,pinkYellow=0;
		
		for (int i = 33; i < 999; i++) {
			if (i%3==0) 
			{
				System.out.println("  "+i+" => PINK");
				pink=pink+1;
			}
			if (i%5==0) 
			{
				System.out.println("  "+i+" => YELLOW");
				yellow=yellow+1;
			}
			if (i%3==0 && i%5==0) 
			{
				System.out.println("  "+i+" => PINK & YELLOW");
				pinkYellow=pinkYellow+1;
			}
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("      Count of PINK : "+pink);
		System.out.println("      Count of YELLOW : "+yellow);
		System.out.println("      Count of PINK & YELLOW : "+pinkYellow);
	}

}
