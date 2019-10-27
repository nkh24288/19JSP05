package Day4;

public class Mainlab23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ret1 = new Rectangle("Yellow", 10, 20);
		System.out.println("Rectangle area shape: " +ret1.getArea());
		System.out.println("Rectangle info: " +ret1.color);
		
		Triangle tri1 = new Triangle("Red", 15, 25);
		System.out.println("Triangle area shape: " +tri1.getArea());
		System.out.println("Triangle info: " +tri1.color);
	}

}
