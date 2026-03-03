package generics;

import java.util.ArrayList;
import java.util.List;

public class NormalLibrary {
	
	private List<Mediium> mediums;
	
	public NormalLibrary() {
		this.mediums = new ArrayList<Mediium>();
	}
	
	public void addMedia(Mediium m) {
		this.mediums.add(m);
	}
	
}
