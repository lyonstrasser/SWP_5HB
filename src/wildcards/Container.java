package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {
	
	private List<T> list;
	
	public Container() {
		this.list = new ArrayList<T>();
	}
	
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	public void add(T content) {
		this.list.add(content);
	}
	
	public static double sumItems(Container<? extends Number> c) {
		double sum = 0;
		for(Number item : c.getList()) {
			sum += item.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Container<Integer> c1 = new Container<>();
		c1.add(10);
		c1.add(20);
		c1.add(5);
		
		System.out.println(Container.sumItems(c1));
		
	}

}
