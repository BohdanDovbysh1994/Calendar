package ZooClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Metod {
	Scanner scanner = new Scanner(System.in);
	Zoo_Club zoo_Club = new Zoo_Club(new HashMap<>());

	public Person add_person() {
		String name = "name" + (int) Math.random() * 100;
		int age = (int) Math.random() * 80;
		Person person = new Person(name, age);
		return person;

	}

	public void add_pet() {
		System.out.println("enter type");

		String name = "Animal name" + (int) Math.random();
		String type = scanner.next();
		
		zoo_Club.map.put(add_person(), new Animal(name, type));

	}
	public void show_all(){
		zoo_Club.map.get(scanner);
	}
	
}
