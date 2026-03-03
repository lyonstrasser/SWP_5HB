package generics;

import java.sql.Date;

public class Magazine {
	
	private String title;
	private String description;
	private String author;
	private Date published;
	
	public Magazine(String title, String description, String author, Date published) {
		this.title = title;
		this.description = description;
		this.author = author;
		this.published = published;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", author=" + author + ", published="
				+ published + "]";
	}
}
