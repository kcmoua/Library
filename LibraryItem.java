
public class LibraryItem {
	// variables
	private String title, author, condition;
	private int isbn, pages;
	// constructor
	public LibraryItem(String title, String author, int isbn, int pages, String condition) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
		this.condition = condition;
	}
	// getters
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public int getIsbn() {
		return this.isbn;
	}
	public int getPages() {
		return this.pages;
	}
	public String getCondition() {
		return this.condition;
	}
	// setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public void checkCondition() {
		if(this.condition.toUpperCase().equals(Condition.NEW.toString())) {
			System.out.println("The book has to be returned in 7 days.");
		} else if(this.condition.toUpperCase().equals(Condition.USED.toString())) {
			System.out.println("The book has to be returned in 10 days.");
		} else {
			System.out.println("The book condition was not specified as \"NEW\" or \"USED\".");
		}
	}
}
