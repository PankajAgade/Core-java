package practiceOne;

public class CompoundIntrest {

	public static void main(String[] args) {
		double p = 2000;
		double r = 0.08;
		double n = 12;
		double t = 5;
		
		//double ci = 2000*(1+0.08/12)power(12*5)-2000;
		double a=Math.pow(1+(r/n),n*t);
		double b = (p * a) - p;
		System.out.println(" Compound Intrest => $"+b);
	}

}
