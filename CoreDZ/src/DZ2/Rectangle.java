package DZ2;

public class Rectangle {

	int length;
	int width;
	
	public Rectangle () {
		int length;
		int width;
		}

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	};
	
	public void perimeter (){
		System.out.println("perimeter of a rectangle = " + (length + width) * 2);
	}
	
	public void square () {
		System.out.println("area of a rectangle is " + length * width);
	}
	 public String parametr (){
		 int perimeter = (length + width) * 2;
		 int square = length * width;
		return perimeter + " " + square;
	 }
	
	
}
