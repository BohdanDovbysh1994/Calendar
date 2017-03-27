package ComodityShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

public class Command {

	Formatter formatter = new Formatter();
	List<Commodity> commodities = new ArrayList<>();

	public void addCommodity() {
		String name = "item " + (int) (Math.random() * 100);
		int price = 100 + (int) (Math.random() * (1000 - 100));
		int weight = 10 + (int) (Math.random() * (100 - 10));
		Commodity commodity = new Commodity(name, price, weight);
		commodities.add(commodity);
	}

	public void sort_by_price_lower() {
		Collections.sort(commodities, new Sort_by_price_lower());
	}

	public void sort_by_price_higher() {
		Collections.sort(commodities, new Sort_by_price_higher());
	}

	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}

	public void show_pages(List<Commodity> commodities, int page) {
		
	
		int spacing = 31;
		
			for (int i = 0; i < 3; i++) {
				formatter = new Formatter();
				System.out.println(formatter.format("%1$s %2$s %3$s", commodities.get(i), commodities.get(i + 3),
						commodities.get(i + 6)));
				
			}
		
		
		System.out.printf("%" + spacing + "s", "");
		for (int i = 1; i <= 11; i++) {
			if (i == page) {
			} else {
				System.out.print(" " + i + " ");
			}
			if (i == page) {
				System.out.print("{" + page + "}");
			}

		}
		System.out.println();
	}
	public void showAll(){
		for (int i = 0; i < 33 ; i++) {
		
			formatter = new Formatter();
			System.out.println(formatter.format("%1$s %2$s %3$s",i + " " +  commodities.get(i),(i+33 )+ " " + commodities.get(i + 33),
				(i+66 )+ " " +	commodities.get(i + 66)));			
		}
	}
	@Override
	public String toString() {
		return "Command commodities=" + commodities;
	}

}
