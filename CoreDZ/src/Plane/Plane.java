package Plane;

public class Plane {

	private Passenger[] passengers;
	private Engine engine;

	public Plane(Passenger[] passengers, Engine engine) {
		super();
		this.passengers = passengers;
		this.engine = engine;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
