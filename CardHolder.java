import java.util.List;

public class CardHolder {
	// variables
	private String firstName, lastName, email;
	private int holderID;
	private boolean checkout, reserve;
	private List<Book> overdueBooks;
	private List<Periodical> overduePeriodicals;
	// constructor
	public CardHolder(String firstName, String lastName, String email, int holderID, boolean checkout, boolean reserve, List<Book> overdueBooks, List<Periodical> overduePeriodicals) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.holderID = holderID;
		this.checkout = checkout;
		this.reserve = reserve;
		this.overdueBooks = overdueBooks;
		this.overduePeriodicals = overduePeriodicals;
	}
	// getters
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastname() {
		return this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public int getHolderId() {
		return this.holderID;
	}
	public boolean getCheckout() {
		return this.checkout;
	}
	public boolean getReserve() {
		return this.reserve;
	}
	public List<Book> getOverdueBooks() {
		return this.overdueBooks;
	}
	public List<Periodical> getOverduePeriodicals() {
		return this.overduePeriodicals;
	}
	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setHolderId(int holderID) {
		this.holderID = holderID;
	}
	public void setCheckout(boolean checkout) {
		this.checkout = checkout;
	}
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}
	public void setOverdueBook(List<Book> overdueBooks) {
		this.overdueBooks = overdueBooks;
	}
	public void setOverduePeriodical(List<Periodical> overduePeriodicals) {
		this.overduePeriodicals = overduePeriodicals;
	}
	// add overdue items to Lists
	public void addOverdueBook(Book book) {
		overdueBooks.add(book);
	}
	public void addOverduePeriodical(Periodical periodical) {
		overduePeriodicals.add(periodical);
	}
	
}
