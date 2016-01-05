package modifyCar;

public class LeatherSeats extends VehicleDecorater {

	Vehicle vehicle;
	
	public LeatherSeats(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public String getDescription() {
		return "Leather Seats " + vehicle.getDescription();
	}

	@Override
	public double cost() {
		return 100 + vehicle.cost();
	}

}
