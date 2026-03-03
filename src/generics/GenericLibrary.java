package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericLibrary<T> {
	
	private List<T> objects;

	public GenericLibrary() {
		this.objects = new ArrayList<T>();
	}
	
	public void addMedia(T media) {
		this.objects.add(media);
	}
	
	public void retrieveLast() {
		
	}
	
}
