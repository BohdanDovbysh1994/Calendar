package VerRad;

public class Deputy extends Human{
	private String name;
	private String secondName;
	private boolean grafter;
	private int priceBribes;
	public Deputy(int weight, int height, String name, String secondName, boolean grafter) {
		super(weight, height);
		this.name = name;
		this.secondName = secondName;
		this.grafter = grafter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public boolean isGrafter() {
		return grafter;
	}
	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}
	public int getPriceBribes() {
		return priceBribes;
	}
	public void setPriceBribes(int priceBribes) {
		this.priceBribes = priceBribes;
	}
	
	public void giveBribe(){
		if(grafter == false){
			System.out.println("Цей депутат не бере хабара");
		}else{
			System.out.println("Enter number of money...");
			int money = Main.scanner.nextInt();
			if(money>5000){
				System.out.println("Міліція увязнила депутата");
			} else if(money > 0){
				priceBribes = priceBribes + money;
			}
		}
	}
	@Override
	public String toString() {
		return "Deputy [name=" + name + ", secondName=" + secondName + ", grafter=" + grafter + ", priceBribes="
				+ priceBribes + "]";
	}
	
}
