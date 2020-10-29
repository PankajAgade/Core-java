package day_6_Vehicle;
/*
Define a class named Vehicle as described below:
	i) Data Members:
		a. vehicle name
		b. vehicle model number	
		c. vehicle price
		d. service station name
	ii) Methods:
		a. Constructor
		b. Display() method to display all the details of class Vehicle .
	iii) Define another class named Bike that extends the class Vehicle.
		a. Data Members: discountRate
		b. Constructor
		c. Methods:display() to display bike name,bike model number,bike price,service station name,discount rate.
		d. Discount() method to compute the discount.
	iv) Create an object for the class Bike and test it.
 */
public class BikeMain {
	public static void main(String[] args) {
		String name="yamaha",service="Pune";
		int model=12,price=100;
		float discount=10;
		
		Bike obj = new Bike(name,service,model,price,discount);
		obj.Display();
		obj.Discount();
	}
}
