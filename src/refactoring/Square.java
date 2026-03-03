package refactoring;

// keine final-Attribute
// 

public class Square extends Geometry {

	private double height;
	
	protected Square(double height, boolean filled, String color) {
		super(filled, color);

		if (height <= 0) {
			throw new IllegalArgumentException("Height must be greater than 0");
		}
		
		this.height = height;
	}

	/*protected Square(int id, double width, double height, boolean filled, String color) throws IdException {
		super(id, width, height, filled, color);

		if (width < 0 || height < 0) {
			System.out.println("Value less than zero not allowed!");
		}
		this.id = id;
		this.width = width;
		this.height = height;
	}*/

	@Override
	public double calculateArea() {
		return height * height;
	}

	@Override
	public double getCircumference() {
		return 4 * height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
