
public class Newspaper extends Periodical implements Loanable, Reservable {
	// variables
	private String day;
	// constructors
	public Newspaper() {
		
	}
	public Newspaper(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition, int year, String day) {
		super(title, pages, author, pubCompany, condition, year);
		this.day = day;
	}
	// getters
	public String getDay() {
		return this.day;
	}
	// setters
	public void setDay(String day) {
		this.day = day;
	}
	// interface methods
	public boolean isLoanable() {
		return true;
	}
	public double lateFee() {
		return 3.0;
	}
	public LateFeeCharges lateFeeCharges() {
		return LateFeeCharges.WEEKLY;
	}
	public boolean isReservable() {
		return true;
	}
	
}
