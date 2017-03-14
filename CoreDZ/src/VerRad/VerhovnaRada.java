package VerRad;

import java.util.ArrayList;

public class VerhovnaRada {
	ArrayList<Faction> factions = new ArrayList<>();
	private String name;
	ArrayList<Faction> fractions = new ArrayList<>();
	Faction fraction = new Faction(name);

	public void addFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		Faction fraction = new Faction(name);
		fractions.add(fraction);

	}

	public void allFractions() {
		for (int i = 0; i < fractions.size(); i++) {
			System.out.println(fractions.get(i).getFactionName());

		}
	}

	public void deleteFraction() {
		System.out.println("Enter name of fraction which you want to delete");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {
				fractions.remove(i);
			}
		}
	}

	public void showFraction() {
		System.out.println("Enter name of fraction which you want to show");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {
				System.out.println(fractions.get(i));
			}
		}
	}

	public void addAnDeputyToConcreteFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {
				fractions.get(i).addDeputy();
				;
			}
		}
	}

	public void deleteDeputy() {
		System.out.println("Enter name of fraction which you want to delete");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {

				fractions.get(i).remuveDeputy();

			}
		}
	}

	public void showAllBribersInFraction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {
				fractions.get(i).factionGrafter();
			}
		}
	}

	public void biggestBribeInFaction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {
				fractions.get(i).factionBiggestGrafter();
			}
		}
	}

	public void AllDeputiesInFaction() {
		System.out.println("Enter name of fraction");
		String name = Main.scanner.next();
		for (int i = 0; i < fractions.size(); i++) {
			if (name.equalsIgnoreCase(fractions.get(i).getFactionName())) {
				fractions.get(i).allDeputies();
				
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
