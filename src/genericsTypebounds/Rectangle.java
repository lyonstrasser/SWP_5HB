package genericsTypebounds;

public class Rectangle extends Shape{

	public Rectangle(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		System.out.println("Rectangle in colour " + getColour());
	}
	
}
