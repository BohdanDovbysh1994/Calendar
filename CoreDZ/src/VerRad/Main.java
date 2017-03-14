package VerRad;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean work = true;
		while (work) {

			VerhovnaRada rada = new VerhovnaRada();
			Fanction fanction = new Fanction();
			//fanction.menu();
			
			rada.addFraction();
	

			rada.addAnDeputyToConcreteFraction();
			rada.addAnDeputyToConcreteFraction();

			rada.AllDeputiesInFaction();
			
			
			String choise = Main.scanner.next();
			switch (choise) {
			case "1":{
				rada.addFraction();
				break;
			}
			case "2":{
				rada.deleteFraction();
				break;
			}
			case "3":{
				
				break;
			}
			case "4":{
				rada.allFractions();
				break;
			}
			case "5":{
				break;
			}
			case "6":{
				rada.addAnDeputyToConcreteFraction();
				break;
			}
			case "7":{
				rada.deleteDeputy();
				break;
			}
			case "8":{
				rada.showAllBribersInFraction();
				break;
			}
			case "9":{
				rada.biggestBribeInFaction();
				break;
			}
			
			
			}
		}

	}

}
