
public class Book extends LibraryItem {
	// BookType enum
	public enum BookType {
		GENERAL, REFERENCE
	}
	// variables
	private BookType bookType;
	// constructors
	public Book() {
		
	}
	public Book(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition, BookType bookType) {
		super(title, pages, author, pubCompany, condition);
		this.bookType = bookType;
	}
	// getters
	public BookType getBookType() {
		return this.bookType;
	}
	// setters
	public void setGenre(BookType bookType) {
		this.bookType = bookType;
	}
	
}
