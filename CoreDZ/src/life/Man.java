package life;

public class Man extends Human {

	private Car car;
	
	public Man(String name, int age, int money) {
		super(name, age, money);
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	

}
