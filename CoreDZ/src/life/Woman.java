package life;

public class Woman extends Human {
	private boolean isLove ;
	
	
	public Woman(String name, int age, int money, boolean isLove) {
		super(name, age, money);
		// TODO Auto-generated constructor stub
	}

	public boolean isLove() {
		return isLove;
	}

	public void setLove(boolean isLove) {
		this.isLove = isLove;
	}

	@Override
	public String toString() {
		return "Woman [isLove=" + isLove + "]";
	}

	

}
