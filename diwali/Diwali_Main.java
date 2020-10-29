package diwali;
/*
Let us Assume and do the programming:
 An organization provides Diwali bonus of 35% to their employees.
  If the year of service of that employee is more than 5 years and 
  gives Diwali bonus of 15% to the employees if the year of service is less
   than 5 years. Now Create a class and its respective methods to enter the
    data from the user and calculate total salary of the employee
*/
public class Diwali_Main {

	public static void main(String[] args) {
		
			Bonus_input obj = new Bonus_input();
			obj.input();
			double TotalSllary = obj.SallaryCalculator();
			System.out.println("     Total Sallary => "+TotalSllary);
			

	}

}
