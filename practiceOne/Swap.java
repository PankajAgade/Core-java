package practiceOne;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 10;
		int temp;
		
		System.out.println("Before Swaping =>");
		System.out.println("	a = "+a);
		System.out.println("	b = "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swaping =>");
		System.out.println("	a = "+a);
		System.out.println("	b = "+b);
		
		
		int x = 10;
		int y = 20;
		
		System.out.println("Before Swaping =>");
		System.out.println("	x = "+x);
		System.out.println("	y = "+y);
		
		System.out.println("2nd After Swaping =>");
		y = x+y;
		x = y-x;
		y = y-x;
		System.out.println("	x = "+x);
		System.out.println("	y = "+y);
	}

}
