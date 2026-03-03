package genericsTypebounds;

public class ShapeBox<T extends Shape> {
	
	private T shape;
	
	public ShapeBox(T shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		this.shape.draw();
	}
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle("Blue");
		Rectangle r1 = new Rectangle("Red");
		
		ShapeBox<Circle> circleBox = new ShapeBox<>(c1);
		circleBox.drawShape();
		
		ShapeBox<Rectangle> rectangleBox = new ShapeBox<>(r1);
		rectangleBox.drawShape();
		
	}
	
}

