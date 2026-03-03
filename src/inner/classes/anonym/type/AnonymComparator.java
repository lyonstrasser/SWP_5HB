package inner.classes.anonym.type;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymComparator {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Java", "Programmierung", "HTL", "Code"};
		
		// Sortieren mit anonymer Klasse
		Arrays.sort(words, new Comparator<String>() {						// Comparator<> ist ein Interface
					public int compare(String s1, String s2) {
						return Integer.compare(s1.length(), s2.length());	// anonyme Klasse implementiert Interface
					}
		});
		
		// Arrays.sort(x, y)
		// x ... Array zu sortieren
		// y ... Vergleichsmethode (hier selbst ausimplementiert) 
		
		System.out.println(Arrays.toString(words));
		
	}

}
