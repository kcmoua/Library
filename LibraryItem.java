
public class LibraryItem {
	// variables
	private String title, author;
	private int id, pages;
	private Condition condition;
	// constructor
	public LibraryItem(String title, String author, int id, int pages, Condition condition) {
		this.title = title;
		this.author = author;
		this.id = id;
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
	public int getId() {
		return this.id;
	}
	public int getPages() {
		return this.pages;
	}
	public Condition getCondition() {
		return this.condition;
	}
	// setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuhtor(String author) {
		this.author = author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setCondition(Condition itemCondition) {
		this.condition = itemCondition;
	}
}
