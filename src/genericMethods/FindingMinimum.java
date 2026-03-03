package genericMethods;

public class FindingMinimum {
	
	public static <T extends Comparable<T>> T findMin(T first, T second) {
		return first.compareTo(second) < 0 ? first : second;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMin(10, 15));
		System.out.println(findMin("Dog", "Cat"));
	}

}
