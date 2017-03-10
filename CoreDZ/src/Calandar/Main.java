package Calandar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean work = true;
		while (work){
		Month[] months = Month.values();

		System.out.println("Press 1 for checking month");
		System.out.println("Press 2 for такий же сезон");
		System.out.println("Press 3 for такак сама кількість днів");
		System.out.println("Press 4 for меншої кількості днів");
		System.out.println("Press 5 for більшої кількості днів");
		System.out.println("Press 6 for next season");
		System.out.println("Press 7 for previous season");
		System.out.println("Press 8 for парну кількість днів");
		System.out.println("Press 9 for непарну кількість днів");
		System.out.println("Press 10 for даний місяць має парну кількість днів");
		Scanner scanner = new Scanner(System.in);
		
		String choise = scanner.next();
		
		switch (choise) {
		case "1": {
			System.out.println("Enter name of the month");
			boolean exist = false;
			String userMonth = scanner.next();

			for (int i = 0; i < months.length; i++) {

				if (userMonth.equalsIgnoreCase(months[i].name())) {
					System.out.println("yes");
					exist = true;
					break;
				}

			}
			if (exist == false) {
				System.out.println("no");
			}
			break;
		}
		case "2": {
			System.out.println("Enter month");
			String month = scanner.next();
			for (int i = 0; i < months.length; i++) {
				if (month.equalsIgnoreCase(months[i].name())) {
					for (int j = 0; j < months.length; j++) {
						if (months[i].getSeason().equals(months[j].getSeason())) {
							System.out.println(months[j].name());
						}
					}

				}
			}

			break;
		}
		case "3": {
			System.out.println("Enter month");
			String monthName = scanner.next();
			for (int i = 0; i < months.length; i++) {
				if (monthName.equalsIgnoreCase(months[i].name())) {
					for (int j = 0; j < months.length; j++) {
						if (months[i].getDays() == months[j].getDays()) {
							System.out.println(months[j].name());
						}
					}

				}
			}
			break;
		}
		case "4": {
			System.out.println("Enter month");
			String month = scanner.next();
			for (int i = 0; i < months.length; i++) {
				if (month.equalsIgnoreCase(months[i].name())) {
					for (int j = 0; j < months.length; j++) {
						if (months[i].getDays() > months[j].getDays()) {
							System.out.println(months[j].name());
						}
					}
				}
			}
			break;
		}
		case "5": {
			System.out.println("Enter month");
			String month = scanner.next();
			for (int i = 0; i < months.length; i++) {
				if (month.equalsIgnoreCase(months[i].name())) {
					for (int j = 0; j < months.length; j++) {
						if (months[i].getDays() < months[j].getDays()) {
							System.out.println(months[j].name());
						}
					}
				}
			}
		}
		case "6": {
			System.out.println("Enter month");
			String month = scanner.next();
			for (int i = 0; i < months.length; i++) {
				if (month.equalsIgnoreCase(months[i].name())) {
					for (int j = months[i].ordinal(); j < months.length; j++) {
						if (months[i].ordinal() == months.length - 1) {
							for (int j1 = 0; j1 < months.length; j1++) {
								if (!months[i].getSeason().equals(months[j1].getSeason())) {
									System.out.println(months[j1].getSeason());
									break;
								}
							}
						} else if (!months[i].getSeason().equals(months[j].getSeason())) {
							System.out.println(months[j].getSeason());
							break;
						}
					}

				}
			}
			break;
		}
		case "7": {
			System.out.println("Enter month");
			String season = scanner.next();
			for (int i = 0; i < months.length; i++) {
				if (season.equalsIgnoreCase(months[i].name())) {
					for (int j = months[i].ordinal(); j >= 0; j--) {
						if (months[i].ordinal() == 0) {
							for (int j2 = months.length - 1; j2 >= 0; j2--) {
								if (!months[i].getSeason().equals(months[j2].getSeason())) {
									System.out.println(months[j2].getSeason());
									break;
								}
							}
						} else if (!months[i].getSeason().equals(months[j].getSeason())) {
							System.out.println(months[j].getSeason());
							break;
						}
					}
				}
			}
		}
		case "8":{
			for (int i = 0; i < months.length; i++) {
				if (months[i].getDays()%2 == 0){
					System.out.println(months[i].name());
				}
			}
			break;
		}
		case "9": {
			for (int i = 0; i < months.length; i++) {
				if(months[i].getDays()%2 != 0){
					System.out.println(months[i].name());
				}
			}
			break;
		}
		case "10": {
			System.out.println("Enter month");
			String month = scanner.next();
			for (int i = 0; i < months.length; i++){
				if (month.equalsIgnoreCase(months[i].name())){
					for (int j = 0; j < months.length; j++) {
						if (months[i].getDays()%2 == 0){
							System.out.println("Парна");
							break;
						}else {
							System.out.println("Непарна");
							break;
						}
					}
				}
			}
			break;
		}
		}
	}
	}
}
