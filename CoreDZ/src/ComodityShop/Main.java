package ComodityShop;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Command command = new Command();
		boolean work = true;
		while (work) {
			System.out.println("Press 1 for add");
			System.out.println("Press 2 for sort _ by higher");
			System.out.println("Press 3 for sort_ by lower");
			System.out.println("Press 4 for chose page");
			System.out.println("Press 5 for all comodities");

			String choise = scanner.next();
			switch (choise) {
			case "1": {
				for (int i = 0; i < 101; i++) {
					command.addCommodity();
				}

				break;
			}
			case "2": {
				command.sort_by_price_higher();
				break;
			}
			case "3": {
				command.sort_by_price_lower();

				break;
			}
			case "4": {
				System.out.println("Enter page");
				int page = Main.scanner.nextInt();
				int max = page * 9;
				int min = max - 9;
				if (max > ( (command.commodities.size() ) ) && min > (command.commodities.size())  ) {

					System.out.println("no page");
				}else if(max>(command.commodities.size())){
					System.out.println(command.commodities.subList(min, command.commodities.size()));
				
				} 
				else {

					command.show_pages(command.commodities.subList(min, max), page);
				}

				break;
			}
			case "5": {
				command.showAll();
			}
			}
		}
	}

}
