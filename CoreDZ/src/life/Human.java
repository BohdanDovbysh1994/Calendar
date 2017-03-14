package life;

public class Human {
	private String name;
	private int age;
	private Job job;
	private Gold gold;
	private int money;
	public Human(String name, int age, int money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Gold getGold() {
		return gold;
	}
	public void setGold(Gold gold) {
		this.gold = gold;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void love (boolean love){
		
	}
	
	

}
