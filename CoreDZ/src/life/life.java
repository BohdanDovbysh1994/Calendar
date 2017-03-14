package life;

public class life {
	private Man man;
	private Woman woman;
	private Gold gold;
	private Job job;
	private Car car;
//	private Family family;
	

	public life(Man man, Woman woman, Gold gold, Job job, Car car) {
		super();
		this.man = man;
		this.woman = woman;
		this.gold = gold;
		this.job = job;
		this.car = car;
	}

	public void setJob() {
		man.setJob(job);
		man.setMoney(man.getMoney() + job.getPayment());
		System.out.println("He is " + job.getName() + " and his salary is " + job.getPayment());
	}

	public void setCar() {
		man.setCar(car);
		if (man.getMoney() > car.getPrice()) {
			man.setCar(car);
			man.setMoney(man.getMoney() - car.getPrice());
			System.out.println("Man has " + car.getName());
		} else {
			man.setCar(null);
			System.out.println("Man cant buy a car");
		}

	}

	public void setGold() {
		man.setGold(gold);
		man.setMoney(man.getMoney() - gold.getPrice());
	}

	public void womanGold() {
		woman.setGold(man.getGold());
		man.setGold(null);
	}

	public void date() {
		if (woman.isLove() == true) {
			woman.setGold(man.getGold());
			man.setGold(null);
			System.out.println("It was good date");
		} else if (man.getCar() != null && car.getPrice()>10000) {
			woman.setGold(man.getGold());
			man.setGold(null);
			System.out.println("It was good date");
		} else {
			System.out.println("no date");
		}
	}

	public void wedding() {
		if (woman.isLove() == true) {
			woman.setMoney(man.getMoney() + woman.getMoney());
			man.setMoney(0);
			System.out.println("They married");
		}else {System.out.println("no wedding");}
	}
	


	public void Information() {
		System.out.println("Man money is " + man.getMoney());
		System.out.println("Woman money is " + woman.getMoney());
		System.out.println("Man has gold " + man.getGold());
		System.out.println("Woman has gold " + woman.getGold());
		System.out.println("Woman is Love " + woman.isLove());
	}

}
