package refactoring;

import java.util.UUID;

// Exception-Klassen wurden ausgelagert in eigene Klassen

/**
 * Die Klasse wurde abstract gesetzt. 
 * Id wurde final gesetzt, damit sie nicht geändert werden kann. 
 * Diese wird nun automatisch im Konstruktur generiert, damit man icht selbst eine vergeben muss. 
 */
public abstract class Geometry implements Comparable<Geometry> {
	private final String id;
	private boolean filled;
	private String color;

	public Geometry() {
		this.id = UUID.randomUUID().toString();
	}

	/**
	 * Throw-Klausel wurde entfernt, da die ID bereits eindeutig generiert wird
	 * @param id
	 * @param filled
	 * @param color
	 */
	protected Geometry(boolean filled, String color) {
		this.id = UUID.randomUUID().toString();
		this.filled = filled;
		this.color = color;
	}

	// Dritter Konstruktor wird nicht mehr benötigt 
	
	public abstract double calculateArea();
	
	/**
	 * Name angepasst, damit man gleich sieht was es macht
	 * @return
	 */
	public abstract double getCircumference();

	
	@Override
	/*
	 * Da das Comparable-Interface implementiert wird, kann man die Vergleichsmethode bereits nutzen
	 */
	public int compareTo(Geometry c) {
		return Double.compare(this.calculateArea(), c.calculateArea());
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getID() {
		return id;
	}
	
}
