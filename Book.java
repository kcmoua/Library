
public class Book extends LibraryItem {

	private String genre;
	
	public Book(String title, String author, int id, int pages, Condition condition, String genre) {
		super(title, author, id, pages, condition);
		this.genre = genre;
	}
	// getters
	public String getGenre() {
		return this.genre;
	}
	// setters
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
