package genericMethods;

public class CountingElements {
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
		int counting = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].compareTo(element) > 0) {
				counting ++;
			}
		}
		return counting;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {1, 3, 5, 7, 9};
		System.out.println(countGreaterThan(numbers, 4));
	}

}
