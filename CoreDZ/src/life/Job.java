package life;

public class Job {
	private String name;
	private int payment;

	public Job(String name, int payment) {
		super();
		this.name = name;
		this.payment = payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}
}
