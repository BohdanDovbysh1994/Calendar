package Comodity;


import java.util.Scanner;


public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Metod metod = new Metod();
		boolean work = true;
		//
		// metod.add_commodity();
		// metod.add_commodity();
		// metod.all();
		while (work) {
			System.out.println("Choise 1 add");
			System.out.println("choise 2 all");
			System.out.println("Choise 3 delete ");
			System.out.println("choise 4  zamina");
			System.out.println("choise 5 sort by name");
			System.out.println("choise 6 sort by length");
			System.out.println("choise 7 sort by weight");
			System.out.println("choise 8 sort by width");
			System.out.println("choise 9 get i");
			String choise = Main.scanner.next();
			switch (choise) {
			case "1": {
				for (int i = 0; i < 10; i++) {
					metod.add_commodity();
					
				}
				break;
			}
			case "2": {
				metod.all();
				break;
			}
			case "3":{
			metod.delete_commodity();
			break;
			}
			case "4":{
				metod.zamina();
				break;
			}
			case "5":{
				metod.sortName();
				break;
			}
			case "6":{
				metod.sortByLength();
				break;
			}
			case "7":{
				metod.sortByWeight();
				break;
			}
			case "8":{
				metod.sortByWidth();
				break;
			}
			case "9":{
				metod.show_i_commodity();
				break;
			}
			}
		}
	}
}
 