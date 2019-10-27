package Day4;

public class Rectangle extends Shape{
	public int length;
	public int width;
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length*width;
		
	}
	
	public String toString() {
		return color;
		
	}
}
