
public class Newspaper extends Periodical {
	
	private String publicationName;
	
	public Newspaper(String title, String author, int isbn, int pages, String condition, int year, String publicationName) {
		super(title, author, isbn, pages, condition, year);
		this.publicationName = publicationName;
	}
	// getters
	public String getPublicationName() {
		return this.publicationName;
	}
	// setters
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
}
