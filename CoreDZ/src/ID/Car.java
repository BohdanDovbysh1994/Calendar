package ID;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private int id;
	private String name;
	private String brend;
	private int year;
	private int maxSpeed;
	public Car(int id, String name, String brend, int year, int maxSpeed) {
		super();
		this.id = id;
		this.name = name;
		this.brend = brend;
		this.year = year;
		this.maxSpeed = maxSpeed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "id " + id+ ", " + " name " + name+ ", " + " brend " + brend+ ", " + " year " + year+ ", " + " maxSpeed " + maxSpeed;
	}

}
