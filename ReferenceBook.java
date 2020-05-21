
public class ReferenceBook extends Book {
	
	private String type;
	
	public ReferenceBook(String title, String author, int isbn, int pages, String condition, String genOrRef, String type) {
		super(title, author, isbn, pages, condition, genOrRef);
		this.type = type;
	}
	// getters
	public String getType() {
		return this.type;
	}
	// setters
	public void setType(String type) {
		this.type = type;
	}
}
