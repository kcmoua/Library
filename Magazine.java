
public class Magazine extends Periodical {
	
	private String magazineType;
	
	public Magazine(String title, String author, int isbn, int pages, String condition, int year, String magazineType) {
		super(title, author, isbn, pages, condition, year);
		this.magazineType = magazineType;
	}
	// getters
	public String getMagazineType() {
		return this.magazineType;
	}
	// setters
	public void setMagazineType(String magazineType) {
		this.magazineType = magazineType;
	}
}
