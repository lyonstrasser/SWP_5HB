package genericsTypebounds;

public class Circle extends Shape{

	public Circle(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		System.out.println("Rectangle in colour " + getColour());
	}
	
}
