package generics;

import java.sql.Date;

public abstract class Mediium {
	
	private String title;
	private String author;
	private Date published;
	
	public Mediium(String title, String author, Date published) {
		this.title = title;
		this.author = author;
		this.published = published;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public abstract void printInfo();
	
}
