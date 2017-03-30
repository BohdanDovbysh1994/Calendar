package Library;

import java.util.Comparator;


public class Sort_by_year_old implements Comparator<Book> {



	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.getYear_of_publication() - o1.getYear_of_publication();
	}

}
