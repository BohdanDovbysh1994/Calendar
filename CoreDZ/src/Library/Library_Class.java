package Library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class Library_Class {
	Map<Author, List<Book>> map = new HashMap<>();
	Set<Entry<Author, List<Book>>> set = map.entrySet();

	void add_Author() {
		System.out.println("Enter name");
		String name = Main.scanner.next();
		System.out.println("Enter SecondName");
		String secondname = Main.scanner.next();
		int height = 160 + (int) (Math.random() * 40);
		int weight = 60 + (int) (Math.random() * 40);
		int age = 16 + (int) (Math.random() * 70);
		map.put(new Author(height, weight, age, name, secondname), new ArrayList<Book>());
	}

	void add_Book() {
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author second name");
		String secondname = Main.scanner.next();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSecondname().equalsIgnoreCase(secondname)) {
				System.out.println("Enter book name");
				String book_name = Main.scanner.next();
				int year_of_publication = 1000 + (int) (Math.random() * 1018);
				int number_of_pages = 10 + (int) (Math.random() * 5000);
				entry.getValue().add(new Book(book_name, year_of_publication, number_of_pages));
			} 
		}
		// Book book = new Book(book_name, year_of_publication,
		// number_of_pages);
	}

	void delete_Book() {
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author second name");
		String secondname = Main.scanner.next();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSecondname().equalsIgnoreCase(secondname)) {
				System.out.println("Enter book name");
				String book_name = Main.scanner.next();
				Collection<Book> books = entry.getValue();
				Iterator<Book> iteratorBook = books.iterator();
				while (iteratorBook.hasNext()) {
					Book book = iteratorBook.next();
					if (book.getBook_name().equalsIgnoreCase(book_name)) {
						iteratorBook.remove();
					}
				}
			} 

		}
	}

	void delete_author() {
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author second name");
		String secondname = Main.scanner.next();
		Iterator<Entry<Author, List<Book>>> iterator_author = set.iterator();
		while (iterator_author.hasNext()) {
			Entry<Author, List<Book>> entry = iterator_author.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSecondname().equalsIgnoreCase(secondname)) {
				iterator_author.remove();
			} else {
				System.out.println("no author");
			}
		}
	}

	void delete_all_books_from_author() {
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author second name");
		String secondname = Main.scanner.next();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSecondname().equalsIgnoreCase(secondname)) {
				Collection<Book> books = entry.getValue();
				Iterator<Book> iterator2 = books.iterator();
				while (iterator2.hasNext()) {
					books.clear();
				}
				// entry.getValue().remove(iterator.next());

			}
		}
	}

	void sort_by_year() {
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author second name");
		String secondname = Main.scanner.next();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSecondname().equalsIgnoreCase(secondname)) {
				List<Book> books = entry.getValue();
				Collections.sort(books, new Sort_by_year_old());
			}
		}
	}
	void sort_by_page(){
		System.out.println("Enter author name");
		String name = Main.scanner.next();
		System.out.println("Enter author second name");
		String secondname = Main.scanner.next();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Author, List<Book>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)
					&& entry.getKey().getSecondname().equalsIgnoreCase(secondname)) {
				List<Book> books = entry.getValue();
				Collections.sort(books, new Sort_by_page());
			}
		}
	}
	public void show_library() {
	//	set = map.entrySet();
		Iterator<Entry<Author, List<Book>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

		void menu(){
			boolean work = true;
			while(work){
			System.out.println("Enter 1 for add_author");
			System.out.println("Enter 2 for add_book_to_author");
			System.out.println("Enter 3 for delete author");
			System.out.println("Enter 4 for delete book");
			System.out.println("Enter 5 for delete_books_from_author");
			System.out.println("Enter 6 for sort by year");
			System.out.println("Enter 7 for sort by number of pages");
			System.out.println("Enter 8 for showing all library");
			System.out.println("Enter 9 for wxit");
			
			String choise = Main.scanner.next();
			switch (choise) {
			case "1":{
				add_Author();
				break;
			}
			case "2": {
				add_Book();
				break;
			}
			case "3":{
				delete_author();
				break;
			}
			case "4":{
				delete_Book();
				break;
			}
			case "5":{
				delete_all_books_from_author();
				break;
			}
			case "6": {
				sort_by_year();
				break;
			}
			case "7":{
				sort_by_page();
				break;
			}
			case "8":{
				show_library();
				break;
			}
			case "9":{
				System.exit(8);
			}
			
			}
			}
		}

	public Set<Entry<Author, List<Book>>> getSet() {
		return set;
	}

	public void setSet(Set<Entry<Author, List<Book>>> set) {
		this.set = set;
	}

}
