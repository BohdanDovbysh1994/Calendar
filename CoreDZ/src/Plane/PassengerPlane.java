package Plane;

public class PassengerPlane extends Plane {

	private String model;

	public PassengerPlane(Passenger[] passengers, Engine engine, String model) {
		super(passengers, engine);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


}
