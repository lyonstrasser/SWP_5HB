package lambdaExpressions;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

import genericsTypebounds.Rectangle;

public class LambdaExpressionForInterfaces {
	
	Runnable runnable = () -> {System.out.println("Runnable");};
	
	ActionListener listener = (ActionEvent e) -> {System.out.println("Listener");};
	
	Supplier<String> supplier = () -> {return "Supplier";};
	
	Consumer<Point> consumer = (Point t) -> {System.out.println("Consumer");};
	
	Comparator<Rectangle> comparator = (Rectangle a, Rectangle b) -> {return 20;};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
