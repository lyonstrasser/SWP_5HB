package refactoring;

import java.util.ArrayList;
import java.util.List;

// Generisches Typ T nicht mehr benötigt, weil Geometry die Oberklasse ist
public class GeometryCollection {
	// final gelöscht, weil die Liste geändert werden muss
	private List<Geometry> geometryList;

	public GeometryCollection() {
		geometryList = new ArrayList<Geometry>();
	}

	public void addGeometry(Geometry g) {
		geometryList.add(g);
	}

	public void removeGeometry(Geometry g) {
		geometryList.remove(g);
	}

	public boolean containsGeometry(Geometry g) {
		return geometryList.contains(g);
	}

	public Geometry getGeometryById(String id) throws InvalidAccessException {
		Geometry element = null;
		for (Geometry g : geometryList) {
			if (g.getID().equals(id)) {
				element = g;
			}
		}

		if (element == null) {
			throw new InvalidAccessException("No such element.");
		}

		return element;
	}
}
