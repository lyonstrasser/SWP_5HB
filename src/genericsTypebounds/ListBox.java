package genericsTypebounds;

import java.util.ArrayList;
import java.util.List;

public class ListBox<T extends Number> {
	
	private List<T> list;
	
	public ListBox() {
		this.list = new ArrayList<T>();
	}
	
	public void add(T t) {
		this.list.add(t);
	}
	
	public double sumElements() {
		double sum = 0;
		for(T t : this.list) {
			sum += t.doubleValue();
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListBox<Double> doubleList = new ListBox<>();
		doubleList.add(5.3);
		doubleList.add(4.7);
		System.out.println(doubleList.sumElements());
		
		ListBox<Integer> intList = new ListBox<>();
		intList.add(15);
		intList.add(5);
		System.out.println(intList.sumElements());
		
		
	}

}
