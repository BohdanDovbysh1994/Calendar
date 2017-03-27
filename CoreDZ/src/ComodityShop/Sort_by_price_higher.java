package ComodityShop;

import java.util.Comparator;

public class Sort_by_price_higher implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o2.getPrice() - o1.getPrice();
	}

}
