
public class Magazine extends Periodical implements Loanable, Reservable {
	// MagType enum
	public enum MagType {
		POPULAR, TRADE, SCHOLARLY
	}
	// variables
	private MagType magazineType;
	// constructors
	public Magazine() {
		
	}
	public Magazine(String title, int pages, Author author, PublishingCompany pubCompany, Condition condition, int year, MagType magazineType) {
		super(title, pages, author, pubCompany, condition, year);
		this.magazineType = magazineType;
	}
	// getters
	public MagType getMagazineType() {
		return this.magazineType;
	}
	// setters
	public void setMagazineType(MagType magazineType) {
		this.magazineType = magazineType;
	}
	// interface methods
	public boolean isLoanable() {
		return true;
	}
	public double lateFee() {
		return 3.0;
	}
	public LateFeeCharges lateFeeCharges() {
		return LateFeeCharges.BIWEEKLY;
	}
	public boolean isReservable() {
		return true;
	}
	
}
