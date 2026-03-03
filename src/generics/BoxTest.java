package generics;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b1 = new Box<>(10);
		System.out.println(b1.getValue());
		
		Box<Double> b2 = new Box<>(11.5);
		System.out.println(b2.getValue());
		
		Box<String> b3 = new Box<>("Zwölf");
		System.out.println(b3.getValue());
	}

}
