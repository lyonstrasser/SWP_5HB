package refactoring;

public class Rectangle extends Geometry {

	private double width;
	private double height;
	
	protected Rectangle(double width, double height, boolean filled, String color) {
		super(filled, color);
		
		if (width <= 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}

		if (height <= 0) {
			throw new IllegalArgumentException("Height must be greater than 0");
		}
		
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double getCircumference() {
		return 2 * (width + height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
}
