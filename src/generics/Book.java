package generics;

import java.sql.Date;

public class Book extends Mediium{
	
	private String description;
	
	
	public Book(String title, String description, String author, Date published) {
		super(title, author, published);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void printInfo() {
		System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublished: " + getPublished());
	}
	
	
	
}
