import java.util.List;

public class LibraryItem {
	// Condition enum
	public enum Condition {
		USED, NEW
	}
	// variables
	private String title;
	private int pages;
	private Author author;
	private PublishingCompany pubCompany;
	private Condition condition;
	// constructors
	public LibraryItem() {
		
	}
	public LibraryItem(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition) {
		this.title = title;
		this.pages = pages;
		this.author = author;
		this.pubCompany = pubCompany;
		this.condition = condition;
	}
	// getters
	public String getTitle() {
		return this.title;
	}
	public int getPages() {
		return this.pages;
	}
	public Author getAuthor() {
		return this.author;
	}
	public PublishingCompany getPubCompany() {
		return this.pubCompany;
	}
	public Condition getCondition() {
		return this.condition;
	}
	// setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setPubCompany(PublishingCompany pubCompany) {
		this.pubCompany = pubCompany;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
}
