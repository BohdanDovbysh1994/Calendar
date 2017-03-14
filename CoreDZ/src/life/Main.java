package life;

public class Main {

	public static void main(String[] args) {
		Man man = new Man("Victor", 35, 4000);
		Woman woman = new Woman("Anna", 25, 1000, true);
		Job job = new Job("Bankir", 25000);
		Car car = new Car("Mercedes", 19000);
		Gold gold = new Gold(3000);
		life life = new life(man, woman, gold, job, car);

		
		woman.setLove(true);
		
		life.setJob();
		life.setCar();
		life.setGold();
		life.womanGold();
		life.date();
		life.wedding();
		
		life.Information();
	}

}
