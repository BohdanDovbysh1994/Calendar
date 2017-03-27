package Comodity;


	import java.util.Comparator;

	public class Sort_by_length implements Comparator<Commodity> {

	 @Override
	 public int compare(Commodity o1, Commodity o2) {
	  return (int) (o1.getLenght_of_commodity() - o2.getLenght_of_commodity());
	 }

	}

