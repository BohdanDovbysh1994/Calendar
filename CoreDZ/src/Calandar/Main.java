package Calandar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean work = true;
		while (work) {
			Function function = new Function();
			Scanner scanner = new Scanner(System.in);
			function.menu();
			String choise = scanner.next();
			switch (choise) {
			case "1": {
				function.checkMonth();
				break;
			}
			case "2": {
				function.sameSeason();

				break;
			}
			case "3": {
				function.sameDays();
				break;
			}
			case "4": {
				function.moreDays();
				break;
			}
			case "5": {
				function.lessDays();
				break;
			}
			case "6": {
				function.nextSeason();
				break;
			}
			case "7": {
				function.previousSeason();
				break;
			}
			case "8": {
				function.evenDays();
				break;
			}
			case "9": {
				function.oddDays();
				break;
			}
			case "10": {
				function.evenDaysMonth();
				break;
			}
			default: {
				System.out.println("Error key");
				System.exit(0);
			}
			}
		}
	}
}
