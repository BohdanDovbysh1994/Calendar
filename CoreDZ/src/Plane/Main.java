package Plane;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Engine engine1 = new Engine(1000);
		Engine engine2 = new Engine(2000);

		Passenger[] passengers1 = { new Passenger("anton", 86), new Passenger("vova", 100), new Passenger("ira", 40) };

		Passenger[] passengers2 = { new Passenger("vika", 45), new Passenger("igor", 70), new Passenger("roza", 47) };

		PassengerPlane passengerPlane1 = new PassengerPlane(passengers1, engine1, "AN - 24");

		PassengerPlane passengerPlane2 = new PassengerPlane(passengers2, engine2, "airobus 360");

		int sum = 0;
		int sum2=0;
		int ser = 0;
		int ser2 = 0;
		
		for (int i = 0; i < passengerPlane1.getPassengers().length; i++) {
			sum = sum + passengerPlane1.getPassengers()[i].getWeight();
			
		}
		
		ser = sum / passengerPlane1.getPassengers().length;
		for (int i = 0; i < passengerPlane2.getPassengers().length; i++) {
			sum2 += passengerPlane2.getPassengers()[i].getWeight();
		

		}
		
		ser2 = sum2 / passengerPlane2.getPassengers().length;
		
		if (ser > ser2){
			System.out.println(passengerPlane1.getModel());
		}else System.out.println(passengerPlane2.getModel());
		
		
	}
}
