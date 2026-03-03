package refactoring;

public class DrawIt {
	public static void main(String[] args) throws IdException {

		Geometry filledGreyRect = new Rectangle(10, 5, true, "grey");
		Geometry unfilledBlueRect = new Rectangle(8, 2, false, "blue");
		Geometry filledGreyCircle = new Circle(3, true, "grey");
		Geometry unfilledRedCircle = new Circle(5, false, "red");

		GeometryCollection construction = new GeometryCollection();

		construction.addGeometry(filledGreyRect);
		construction.addGeometry(unfilledBlueRect);
		construction.addGeometry(filledGreyCircle);
		construction.addGeometry(unfilledRedCircle);
		
		try {
			System.out.println("The area of the object is: " + construction.getGeometryById(filledGreyRect.getID()).calculateArea());
		} catch (InvalidAccessException e1) {
			System.out.println(e1.getMessage());
		}

		System.out.println(construction.containsGeometry(unfilledRedCircle));
		try {
			construction.removeGeometry(unfilledRedCircle);
			System.out.println(construction.getGeometryById(unfilledBlueRect.getID()).calculateArea());
			System.out.println(construction.containsGeometry(unfilledRedCircle));
		} catch (InvalidAccessException e) {
			System.out.println(e.getMessage());
		}
	}
}
