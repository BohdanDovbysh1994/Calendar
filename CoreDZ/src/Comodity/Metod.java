package Comodity;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;




public class Metod {
	ArrayList<Commodity> commodities = new ArrayList<>();
//	Set<Commodity> commodities = new LinkedHashSet<>();
	Iterator<Commodity> iterator = commodities.iterator();
	private Commodity commodity;

	public void add_commodity() {

		System.out.println("Please enter name of commodity");
		String name_of_commodity = Main.scanner.next();
//		System.out.println("Please enter length of commodity");
//		double lenght_of_commodity = Main.scanner.nextDouble();
//		System.out.println("Please enter width of commodity");
//		double width_of_commodity = Main.scanner.nextDouble();
//		System.out.println("Please enter weight of commodity");
//		double weight_of_commodity = Main.scanner.nextDouble();
//		String name_of_commodity =  "item " + (int) (Math.random() * 100);
		double lenght_of_commodity = (int) (Math.random() * 100) ;
		double width_of_commodity = (int) (Math.random()*200) ;
		double weight_of_commodity = (int) (Math.random() *300);
		Commodity commodity = new Commodity(name_of_commodity, lenght_of_commodity, width_of_commodity,
				weight_of_commodity);
		commodities.add(commodity);
		// System.out.println(commodities);
	}

	public void all() {
		for (Commodity x : commodities) {
			System.out.println(x);
		}
	}

	public void delete_commodity() {
		System.out.println("Please enter name of commodity");
		String name_of_commodity = Main.scanner.next();

		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			Commodity commodityes = iterator.next();
			if (name_of_commodity.equals(commodityes.getName_of_commodity())) {
				iterator.remove();
			}
		}
	}

	public void zamina() {
		System.out.println("Please enter name of commodity");
		String name_of_commodity = Main.scanner.next();
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			Commodity commodityes = iterator.next();
			if (name_of_commodity.equals(commodityes.getName_of_commodity())) {
				iterator.remove();
			}
		}
		System.out.println("Please enter name of commodity");
		String name_of_commodity1 = Main.scanner.next();
		System.out.println("Please enter length of commodity");
		double lenght_of_commodity = Main.scanner.nextDouble();
		System.out.println("Please enter width of commodity");
		double width_of_commodity = Main.scanner.nextDouble();
		System.out.println("Please enter weight of commodity");
		double weight_of_commodity = Main.scanner.nextDouble();
		Commodity commodity1 = new Commodity(name_of_commodity1, lenght_of_commodity, width_of_commodity,
				weight_of_commodity);
		commodities.add(commodity1);
	}

	public void sortName() {
		
		Collections.sort(commodities, new Sort_by_name());
		for(Commodity x : commodities){
			System.out.println(x);
		}
	}
	public void sortByLength(){
		Collections.sort(commodities, new Sort_by_length());;
	}
	public void sortByWidth(){
		Collections.sort(commodities, new Sort_by_width());
	}
	public void sortByWeight(){
		Collections.sort(commodities, new Sort_by_weight());
	}
	public void show_i_commodity() {
		  System.out.println("Enter index of comodyty");
		  int commodity_i = Main.scanner.nextInt();
		  if(commodity_i > commodities.size()){
			  System.out.println("no comodyty");
		  }else{
//		  for (int i = 0; i < commodities.size(); i++) {
//		   if(commodity_i_name.equalsIgnoreCase(commodities.get(i).getName_of_commodity())) {
		    System.out.println(commodities.get(commodity_i));}
		   }
//		  }
//		 }

	@Override
	public String toString() {
		return "Metod [commodities=" + commodities + ", commodity=" + commodity + "]";
	}

}
