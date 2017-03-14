package VerRad;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		VerhovnaRada rada = new VerhovnaRada();

		rada.addFraction();
		rada.addAnDeputyToConcreteFraction();
		rada.addAnDeputyToConcreteFraction();
		rada.showAllBribersInFraction();

	}

}
