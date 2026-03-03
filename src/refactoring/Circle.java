package refactoring;

public class Circle extends Geometry {

	private double radius;

	protected Circle(double radius, boolean filled, String color) {
		super(filled, color);
		
		if (radius <= 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getCircumference() {
		return 2 * radius * Math.PI;

	}
	
	public double getDiameter() {
		return 2 * radius;
	}

}
