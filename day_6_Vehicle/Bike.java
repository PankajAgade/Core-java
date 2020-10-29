package day_6_Vehicle;

import java.util.Scanner;

public class Bike extends Vehicle {

	float discountRate; 	
	
	
	/*Bike()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("vehicle name : ");
		vehicle_name = kb.next();
		System.out.print("vehicle model number : ");
		vehicle_model_number = kb.nextInt();
		System.out.print("vehicle price : ");
		vehicle_price = kb.nextInt();
		System.out.print("service station name : ");
		service_station_name = kb.next();
	}*/
	
	Bike(String name, String service, int model, int price, float discount) {
		//this.vehicle_name = name;
		//this.vehicle_model_number = model;     //that simpe way and another way below
		//this.vehicle_price = price;
		//this.service_station_name = service;
		super(name, service, model, price);
		this.discountRate = discount;
	}
	void Display()
	{
		System.out.println("Bike name"+vehicle_name);
		System.out.println("Bike model number"+vehicle_model_number);
		System.out.println("Bike price"+vehicle_price);
		System.out.println("Bike station name"+service_station_name);	
	}
	void Discount()
	{
		float discountRate =vehicle_price-(0.30f*vehicle_price);
		System.out.println("On Bike 30% Discount.");
		System.out.println("Final Bike price with discount => "+discountRate);
	}
}
