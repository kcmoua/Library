
public class Periodical extends LibraryItem {

	private int year;
	
	public Periodical(String title, String author, int isbn, int pages, String condition, int year) {
		super(title, author, isbn, pages, condition);
		this.year = year;
	}
	// getters
	public int getYear() {
		return this.year;
	}
	// setters
	public void setYear(int year) {
		this.year = year;
	}
}
