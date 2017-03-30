package Library;

public class Book {
private String Book_name;
private int year_of_publication;
private int number_of_pages;
public Book(String book_name, int year_of_publication, int number_of_pages) {
	super();
	Book_name = book_name;
	this.year_of_publication = year_of_publication;
	this.number_of_pages = number_of_pages;
}
public String getBook_name() {
	return Book_name;
}
public void setBook_name(String book_name) {
	Book_name = book_name;
}
public int getYear_of_publication() {
	return year_of_publication;
}
public void setYear_of_publication(int year_of_publication) {
	this.year_of_publication = year_of_publication;
}
public int getNumber_of_pages() {
	return number_of_pages;
}
public void setNumber_of_pages(int number_of_pages) {
	this.number_of_pages = number_of_pages;
}
@Override
public String toString() {
	return "\nBook_name=" + Book_name + ", year_of_publication=" + year_of_publication + ", number_of_pages="
			+ number_of_pages ;
}

}
