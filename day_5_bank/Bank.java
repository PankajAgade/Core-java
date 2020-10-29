package day_5_bank;

public class Bank {

	int amount = 5000;
	
	Bank()
	{
		System.out.println(" No amount will be added to the Bank");
		System.out.println(" final amount => "+amount);
	}
	
	Bank(int addamount)
	{
		this.amount = amount + addamount;
		System.out.println(" final amount => "+amount);
	}
}
