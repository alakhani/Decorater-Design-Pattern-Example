package modifyCar;

/*
 * 
 * Author : Aamin Lakhani
 * 
 * Concrete implementation of the Toyota class that represents a vehicle.
 */
public class Toyota extends Vehicle {

	public Toyota() {
		vehicleDescription = "Toyota car";
	}
	
	@Override
	public double cost() {
		return 10000.00;
	}

}
