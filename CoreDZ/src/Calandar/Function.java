package Calandar;

import java.util.Scanner;

public class Function {
	Month[] months = Month.values();
	Scanner scanner = new Scanner(System.in);
	public void menu() {
		System.out.println("Press 1 for checking month");
		System.out.println("Press 2 for checking month with the same season");
		System.out.println("Press 3 for checking month with the same number of days");
		System.out.println("Press 4 for checking month < days");
		System.out.println("Press 5 for checking month > days");
		System.out.println("Press 6 for next season");
		System.out.println("Press 7 for previous season");
		System.out.println("Press 8 for checking which month has even number of days");
		System.out.println("Press 9 for  checking which month has odd numbers of days");
		System.out.println("Press 10 for checking if your month has has even numbers of dsys");
	}
	public void checkMonth() {
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
		
	}
	public void sameSeason() {
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
	}
	public void sameDays() {
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
	}
	public void moreDays() {
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
	}
	public void lessDays() {
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
	public void nextSeason() {
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

	}
	public void previousSeason() {
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
	public void evenDays() {
		for (int i = 0; i < months.length; i++) {
			if (months[i].getDays() % 2 == 0) {
				System.out.println(months[i].name());
			}
		}
	}
	public void oddDays() {
		for (int i = 0; i < months.length; i++) {
			if (months[i].getDays() % 2 != 0) {
				System.out.println(months[i].name());
			}
		}
	}
	public void evenDaysMonth() {
		System.out.println("Enter month");
		String month = scanner.next();
		for (int i = 0; i < months.length; i++) {
			if (month.equalsIgnoreCase(months[i].name())) {

				if (months[i].getDays() % 2 == 0) {
					System.out.println("Парна");
					break;
				} else {
					System.out.println("Непарна");
					break;
				}
			}

		}
	}
}
