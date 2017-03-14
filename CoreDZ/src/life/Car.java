package life;

public class Car {
	private String name;
	private int price;

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
