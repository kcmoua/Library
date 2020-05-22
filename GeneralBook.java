
public class GeneralBook extends Book implements Loanable, Reservable {
	// variables
	private String genre;
	// constructors
	public GeneralBook() {
		
	}
	public GeneralBook(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition, BookType bookType, String genre) {
		super(title, pages, author, pubCompany, condition, bookType);
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
	// interface methods
	public boolean isLoanable() {
		return true;
	}
	public double lateFee() {
		return 3.0;
	}
	public LateFeeCharges lateFeeCharges() {
		return LateFeeCharges.MONTHLY;
	}
	public boolean isReservable() {
		return true;
	}
	
}
