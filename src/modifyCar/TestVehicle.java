package modifyCar;
/*
 * 
 * Author : Aamin Lakhani
 * 
 * Simple Example of a decorater design pattern. This project illustrates adding add on items to the simple vehicle
 * by adding a wrapper around the simple vehicle object
 */
public class TestVehicle {

	public static void main (String args[]) {
		
		Vehicle simpleVehicle = new Toyota();
		System.out.println(simpleVehicle.getDescription() + " with cost "+simpleVehicle.cost());
		
		Vehicle modifiedVehicle = new Toyota();
		modifiedVehicle = new NavigationSystem(modifiedVehicle);
		modifiedVehicle = new LeatherSeats(modifiedVehicle);
		
		System.out.println(modifiedVehicle.getDescription()+" with cost " + modifiedVehicle.cost());
	}
}
