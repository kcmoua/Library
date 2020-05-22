
public class Periodical extends LibraryItem {
	// variables
	private int year;
	// constructors
	public Periodical() {
		
	}
	public Periodical(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition, int year) {
		super(title, pages, author, pubCompany, condition);
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
