package modifyCar;

/*
 * 
 * Author : Aamin Lakhani
 * 
 * Abstract class representing the vehicle
 */
public abstract class Vehicle {

	String vehicleDescription;
	
	public String getDescription() {
		return this.vehicleDescription;
	}
	
	public abstract double cost();
}
