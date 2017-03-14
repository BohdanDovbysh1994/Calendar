package VerRad;

import java.util.ArrayList;

public class Faction {
	ArrayList<Deputy> deputies = new ArrayList<>();
	private String factionName;
	
	
	

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	public void addDeputy() {
		System.out.println("Enter his weight");
		int weight = Main.scanner.nextInt();
		System.out.println("Enter his height");
		int height = Main.scanner.nextInt();
		System.out.println("Enter his name");
		String name = Main.scanner.next();
		System.out.println("Enter his Secondname");
		String secondName = Main.scanner.next();
		System.out.println("Is deputy grafter? Enter yes or no");
		boolean grafter = false;
		String answer = Main.scanner.next();
		if (answer.equalsIgnoreCase("yes")) {
			grafter = true;
		} else if (answer.equalsIgnoreCase("no")) {
			grafter = false;
		}
		Deputy deputy = new Deputy(weight, height, name, secondName, grafter);
		deputy.giveBribe();
		deputies.add(deputy);
	}

	public void remuveDeputy() {
		System.out.println("Enter his name");
		String name = Main.scanner.next();
		System.out.println("Enter his secondname");
		String secondName = Main.scanner.next();
		for (int i = 0; i < deputies.size(); i++) {
			if (name.equalsIgnoreCase(deputies.get(i).getName())
					&& secondName.equalsIgnoreCase(deputies.get(i).getSecondName())) {
				deputies.remove(i);
			} else {
				System.out.println("No deputy");
			}
		}

	}
	public void factionGrafter(){
		for (int i = 0; i < deputies.size(); i++) {
			if (deputies.get(i).isGrafter() == true){
				System.out.println(deputies.get(i).getName() + " " + deputies.get(i).getSecondName() + " хабарник");
			}
		}
	}
	public void factionBiggestGrafter(){
		int habar = 0;
		String deputat = "";
		for (int i = 0; i < deputies.size(); i++) {
			if(deputies.get(i).getPriceBribes() > habar){
				habar = deputies.get(i).getPriceBribes();
				deputat = deputies.get(i).getName() + " " + deputies.get(i).getSecondName();
			}
		}
		System.out.println(deputat + " найбільший хабарник");
	}
	
	public void allDeputies(){
		for (int i = 0; i < deputies.size(); i++) {
			System.out.println(deputies.get(i));
		}
	}
	public void remuveFaction (){
			deputies.removeAll(deputies);
		
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}


}
