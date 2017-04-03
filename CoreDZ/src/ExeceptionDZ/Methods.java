package ExeceptionDZ;

import java.util.Scanner;

public class Methods {
	Scanner scanner = new Scanner(System.in);
	private int a;
	private int b;
	private int sum;

	// MyException exception = new MyException("Exeption");
	void calc() throws MyException {
		System.out.println("Enter a");
		setA(scanner.nextInt());
		System.out.println("Enter b");
		setB(scanner.nextInt());
		System.out.println("Enter what effect you want to apply + - * /");
		String effect = scanner.next();
		if (effect.equalsIgnoreCase("+")) {
			calcExeption();
			System.out.println(sum = a + b);
		} else if (effect.equalsIgnoreCase("-")) {
			calcExeption();
			System.out.println(sum = a - b);
		} else if (effect.equals("*")) {
			calcExeption();
			System.out.println(sum = a * b);
		} else if (effect.equals("/")) {
			calcExeption();
			System.out.println(sum = a / b);
		}
	}

	public void calcExeption() throws MyException {
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("IllegalArgumentException");
		} else if (a == 0 && b != 0) {
			throw new ArithmeticException("ArithmeticException");
		} else if (a != 0 && b == 0) {
			throw new ArithmeticException("ArithmeticException");
		} else if (a == 0 && b == 0) {
			throw new IllegalArgumentException("IllegalArgumentException");
		} else if(a > 0 && b > 0){
			throw new MyException("My Exeption");
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
