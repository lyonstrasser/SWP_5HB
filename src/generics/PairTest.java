package generics;

public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<Integer, String> p1 = new Pair<>(10, "Zehn");
		
		System.out.println(p1.getFirst());
		System.out.println(p1.getSecond());
		
		Pair<String, Integer> p1Swapped = p1.swap();
		System.out.println(p1Swapped.getFirst());
		
	}

}
