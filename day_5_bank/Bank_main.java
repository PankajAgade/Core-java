package day_5_bank;
/*
Create a class Bank .Initialize an instance variable ” amount” with an initial amount of Rs.5000 and assume you have to add some more amount to it. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Bank
2 - having a parameter which is the amount that will be added to Bank Create object of the 'AddAmount' class and display the final amount in Bank
 */
public class Bank_main {

	public static void main(String[] args) {
		
		Bank obj1 = new  Bank();
		Bank obj2 = new  Bank(500);
		

	}

}
