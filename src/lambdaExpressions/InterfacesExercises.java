package lambdaExpressions;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.JButton;

public class InterfacesExercises {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Runnable Interface
		Runnable r = () -> { 
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		};
		
		r.run();
		
		// Supplier Interface
		Supplier<Integer> s = () -> {return (int) Math.random() * 100;};
		System.out.println(s.get());
		
		// Consumer Interface
		Consumer<String> c = (String one) -> {System.out.println(one.toUpperCase());};
		c.accept("Hallo");
		
		// Comparator Interface
		List<String> list = new ArrayList<>();
		list.add("hallo");
		list.add("tschüss");
		list.add("BIER");
		
		Comparator<String> comparator = (String s1, String s2) -> {return Integer.compare(s1.length(), s2.length());};
		list.sort(comparator);
		for(String sc : list) System.out.println(sc);
		
		// ActionListener Interface
		JButton button = new JButton("Klick mich!");
		
		ActionListener al = e -> System.out.println("Button clicked!");
		
		button.addActionListener(al);
		
		button.doClick();
		
		
		
		// Functional Exercises
		Predicate<String> longerThen5Chars = (String q) -> q.length() > 5;
		String string = "Good Morning";
		System.out.println(longerThen5Chars.test(string));
		
		Consumer<Integer> con = (Integer i) -> {System.out.println( i * 10);};
		con.accept(2);
		
		Supplier<String> sup = () -> {return "Lambda ist cool!";};
		System.out.println(sup.get());
		
	}

}
