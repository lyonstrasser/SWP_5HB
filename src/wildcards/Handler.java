package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Handler<T> {
	
	public void addItems(List<? super T> list, T value) {
		list.add(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handler<Integer> h = new Handler<>();
		List<Number> list = new ArrayList<>();
		
		h.addItems(list, 10);
		
	}

}
