package day_5_ROOM;
/*
Write a program and perform the following:
	a) Define class “ROOM”.
	b) Define data Members as :
		i. Length
		ii. Width
		iii. Height
	c) Define constructors as per requirement.
	d) Define methods as :
		i. Float whiteWashingArea() to compute the area to be whitewashed.
		ii. Int whiteWashingCost() to compute the cost of whitewashing at 
			the rate of Rs.80 per sq.ft
		iii. Int flooringCost() to compute the cost of flooring at the rate of Rs200/-sq.ft for geometric flooring and at the rate of Rs100 /- sq.ft for cement flooring.
		iv. Test this class by creating an object for the class Room and compute the cost for respective methods.
 */
public class room_main {

	public static void main(String[] args) {

		ROOM obj = new ROOM();
		obj.whiteWashingArea();
	}
}
