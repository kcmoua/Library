
public class ReferenceBook extends Book implements Loanable, Reservable{
	// RefType enum
	public enum RefType {
		ALMANAC, ATLAS, BIBLIOGRAPHY, DICTIONARY, ENCYCLOPEDIA
	}
	// variables
	private RefType refType;
	// constructors
	public ReferenceBook() {
		
	}
	public ReferenceBook(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition, BookType bookType, RefType refType) {
		super(title, pages, author, pubCompany, condition, bookType);
		this.refType = refType;
	}
	// getters
	public RefType getRefType() {
		return this.refType;
	}
	// setters
	public void setRefType(RefType refType) {
		this.refType = refType;
	}
	// interface methods
	public boolean isLoanable() {
		return false;
	}
	public double lateFee() {
		return 3.0;
	}
	public LateFeeCharges lateFeeCharges() {
		return LateFeeCharges.DAILY;
	}
	public boolean isReservable() {
		return true;
	}
	
}
