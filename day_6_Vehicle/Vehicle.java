package day_6_Vehicle;

public class Vehicle {
	String vehicle_name;
	int vehicle_model_number;
	int vehicle_price;
	String service_station_name;
	
	
	public Vehicle(String name, String service, int model, int price) {
		this.vehicle_name = name;
		this.vehicle_model_number = model;
		this.vehicle_price = price;
		this.service_station_name = service;
	}

	void Display()
	{
		System.out.println("vehicle name => "+vehicle_name);
		System.out.println("bike model number => "+vehicle_model_number);
		System.out.println("vehicle price => "+vehicle_price);
		System.out.println("service station name => "+service_station_name);
		
	}
}
