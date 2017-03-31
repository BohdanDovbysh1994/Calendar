package ZooClub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Zoo_Club {
	Map<Person, List<Animal>> map = new HashMap<>();;
	Set<Entry<Person, List<Animal>>> set = map.entrySet();



	void add_person() {
		System.out.println("Enter name of person");
		String name = Main.scanner.next();
		int age = 18 + (int) (Math.random() * 70);
		map.put(new Person(name, age), new ArrayList<Animal>());
	}

	void add_animal_to_patticipator() {
		System.out.println("Enter person name");
		String name = Main.scanner.next();
		Iterator<Entry<Person, List<Animal>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Enter type of animal");
				String type = Main.scanner.next();
				System.out.println("Enter name of animal");
				String name_of_animal = Main.scanner.next();
				entry.getValue().add(new Animal(name_of_animal, type));
			}
		}
	}

	void delete_animal_from_participator() {
		System.out.println("Enter person name");
		String name = Main.scanner.next();
		Iterator<Entry<Person, List<Animal>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Enter animal name");
				String animal_name = Main.scanner.next();
				Collection<Animal> animal = entry.getValue();
				Iterator<Animal> iterator2 = animal.iterator();
				while (iterator2.hasNext()) {
					Animal animal2 = iterator2.next();
					if (animal2.getName().equalsIgnoreCase(animal_name)) {
						iterator2.remove();
					}
				}
			}
		}
	}

	void delete_participator() {
		System.out.println("Enter name of participator");
		String name = Main.scanner.next();
		Iterator<Entry<Person, List<Animal>>> iterator = set.iterator();
		while(iterator.hasNext()){
			Entry<Person, List<Animal>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(name)){
				iterator.remove();
			}
		}
	}
	void delete_animal_from_participators(){
	 	System.out.println("Enter type of animal");
    	String type = Main.scanner.next(); 
    	for (Map.Entry<Person, List<Animal>> mep: map.entrySet()) {
    		Iterator<Animal>iterator = mep.getValue().iterator();
    		while (iterator.hasNext()) {
    			Animal animal = iterator.next();
		    	 if(animal.getType().equalsIgnoreCase(type)){
    				iterator.remove();
    			}
			}
    	}
	}
	void show_zooclub(){
		Iterator<Entry<Person, List<Animal>>> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	void menu (){
		boolean work = true;
		while(work){
			System.out.println("Enter 1 for add person");
			System.out.println("Enter 2 for add animal to participator");
			System.out.println("Enter 3 for delete animal from participator");
			System.out.println("Enter 4 for delete participator");
			System.out.println("Enter 5 for delete animal from participators");
			System.out.println("Enter 6 for show zooclub");
			System.out.println("Enter 7 for exit");
		String choise = Main.scanner.next();
		switch (choise) {
		case "1":{
			add_person();
			break;
		}
		case "2":{
			add_animal_to_patticipator();
			break;
		}
		case "3": {
			delete_animal_from_participator();
			break;
		}
		case "4":{
			delete_participator();
			break;
		}
		case "5":{
			delete_animal_from_participators();
			break;
		}
		case "6":{
			show_zooclub();
			break;
		}
		case "7":{
			System.exit(7);
		}
		}
			
		}
	}
}
