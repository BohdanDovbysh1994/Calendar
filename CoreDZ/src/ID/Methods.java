package ID;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
	List<Car> cars = new ArrayList<Car>();
	Scanner scanner = new Scanner(System.in);
	void showData() throws IOException {
		FileReader fileReader = new FileReader("Cars.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedReader.readLine()) != null) {
			System.out.println(tmp);
		}
		bufferedReader.close();
	}
	void findById() throws IOException {
		FileReader fileReader = new FileReader("Cars.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedReader.readLine()) != null) {
			String[] temp = tmp.split("\\s*(=>|,|\\s)\\s*");
			cars.add(new Car(Integer.parseInt(temp[1]), temp[3], temp[5], Integer.parseInt(temp[7]),
					Integer.parseInt(temp[9])));
		}
		boolean car = true;
		System.out.println("Enter ID");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getId()) {
				System.out.println(cars.get(i));
				car = false;
			}
			bufferedReader.close();
		}
		if(car == true){
			System.out.println("no id");
		}
		cars.clear();
	}
	void deleteByID() throws NumberFormatException, IOException {
		FileReader fileReader = new FileReader("Cars.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedReader.readLine()) != null) {
			String[] temp = tmp.split("\\s*(=>|,|\\s)\\s*");
			cars.add(new Car(Integer.parseInt(temp[1]), temp[3], temp[5], Integer.parseInt(temp[7]),
					Integer.parseInt(temp[9])));
		}
		boolean car = true;
		FileWriter fileWriter = new FileWriter("Cars.txt");
		System.out.println("Enter ID");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getId()) {
				cars.remove(i);
				System.out.println("Element remuve");
				car = false;
			}	
		}
		for (int j = 0; j < cars.size(); j++) {
			fileWriter.write(cars.get(j) + "\n");
		}
		if (car == true) {
			System.out.println("no id");
		}
		cars.clear();
		fileWriter.close();
		bufferedReader.close();
	}
	void addCarById() throws NumberFormatException, IOException {
		FileReader fileReader = new FileReader("Cars.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedReader.readLine()) != null) {
			String[] temp = tmp.split("\\s*(=>|,|\\s)\\s*");
			cars.add(new Car(Integer.parseInt(temp[1]), temp[3], temp[5], Integer.parseInt(temp[7]),
					Integer.parseInt(temp[9])));
		}
		boolean car = true;
		System.out.println("Enter ID");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getId()) {
				System.out.println("We have such id");
				car = false;
				cars.clear();
			}
		}
		if (car == true) {
			FileWriter fileWriter = new FileWriter("Cars.txt");
			String name = "model" + (int)(Math.random()*100);
			String brend = "brend" + (int)(Math.random()*100);
			int year = 1800 + (int)(Math.random() * 218);
			int maxSpeed = 200 + (int)(Math.random()*200);
			cars.add(new Car(ID, name, brend, year, maxSpeed));
			for (int j = 0; j < cars.size(); j++) {
				fileWriter.write(cars.get(j) + "\n");
			}
			fileWriter.close();
			cars.clear();
			System.out.println("Element add");
		}
		bufferedReader.close();
	}
	void update() throws NumberFormatException, IOException{
		FileReader fileReader = new FileReader("Cars.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedReader.readLine()) != null) {
			String[] temp = tmp.split("\\s*(=>|,|\\s)\\s*");
			cars.add(new Car(Integer.parseInt(temp[1]), temp[3], temp[5], Integer.parseInt(temp[7]),
					Integer.parseInt(temp[9])));
		}
		boolean car = true;
		System.out.println("Enter ID");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getId()){
				System.out.println("What you want to update? (year of maxSpeed)");
				String update = scanner.next();
				if(update.equalsIgnoreCase("year")){
					System.out.println("Enter new year");
					int year = scanner.nextInt();
					cars.get(i).setYear(year);
					System.out.println("Year update");
				}else if (update.equalsIgnoreCase("maxSpeed")){
					System.out.println("enter new max Speed");
					int maxSpeed = scanner.nextInt();
					cars.get(i).setMaxSpeed(maxSpeed);
					System.out.println("maxSpeed update");
				} else{
					System.out.println("Wrong update parametr");
				}
				car = false;
			}
		}
		FileWriter fileWriter = new FileWriter("Cars.txt");
		for (int j = 0; j < cars.size(); j++) {
			fileWriter.write(cars.get(j) + "\n");
		}
		if(car == true){
			System.out.println("wrong ID");
		}
		cars.clear();
		fileWriter.close();
		bufferedReader.close();
	}
	void format() throws NumberFormatException, IOException{
		String format = "|%1$-7s|%2$-15s|%3$-15s|%4$-15s|%5$-10s|\n";
		  FileReader fileReader = new FileReader("Cars.txt");
		  BufferedReader bufferedRead = new BufferedReader(fileReader);
		  String tmp;
		  System.out.format(format, (" " + "ID") , (" " + "Model" ), (" " +"Brend"),(" " + "Year"), (" " + "maxSpeed"));
		  while ((tmp = bufferedRead.readLine()) != null) {
		   String[] array = tmp.split("\\s*(=>|,|\\s)\\s*");
		   
		   System.out.format(format, (" "+ array[1]), (" " + array[3]), (" " + array[5]),
		     (" " + array[7]), (" " +  array[9]));
		   
		  }
		  bufferedRead.close();
	}

	void menu() throws IOException {
		boolean work = true;
		while (work) {
			System.out.println("Enter 1 for show data");
			System.out.println("Enter 2 for show by ID");
			System.out.println("Enter 3 for remuve by ID");
			System.out.println("Enter 4 for add by ID");
			System.out.println("Enter 5 for update information");
			System.out.println("Enter 6 for show format");
			System.out.println("Enter 7 for exit prog");
			String choise = scanner.next();
			switch (choise) {
			case "1": {
				showData();
				break;
			}
			case "2": {
				findById();
				break;
			}
			case "3": {
				deleteByID();
				break;
			}
			case "4": {
				addCarById();
				break;
			}
			case"5": {
				update();
			}
			case "6":{
				format();
			}
			case "7":{
				System.exit(0);
			}
			}
		}

	}
}
