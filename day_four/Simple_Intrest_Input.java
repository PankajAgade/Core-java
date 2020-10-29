package day_four;

public class Simple_Intrest_Input {
	int p;
	int r;
	int t;
	int si;
	void Value_From_parameter(int p, int r, int t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void CalculateSimpleInterst()
	{
		si = (p*r*t)/100;
	}
	
	void Display()
	{
		System.out.println(" Simpe Intrest => "+si);
	}
	
	
}
