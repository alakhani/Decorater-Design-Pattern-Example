package modifyCar;

/*
 * 
 * Author : Aamin Lakhani
 * 
 * Concrete implementation of the Navigation that can be added to the simple vehicle.
 * The cost of this add on is added to the cost of the simple vehicle in the cost() method
 */
public class NavigationSystem extends VehicleDecorater{

	Vehicle vehicle;
	
	public NavigationSystem(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String getDescription() {
		return "Navigation System " + vehicle.getDescription();
	}

	@Override
	public double cost() {
		return 150 + vehicle.cost();
	}

}
