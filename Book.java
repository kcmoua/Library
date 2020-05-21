
public class Book extends LibraryItem {

	private String genOrRef;
	
	public Book(String title, String author, int isbn, int pages, String condition, String genOrRef) {
		super(title, author, isbn, pages, condition);
		this.genOrRef = genOrRef;
	}
	// getters
	public String getGenOrRef() {
		return this.genOrRef;
	}
	// setters
	public void setGenre(String genOrRef) {
		this.genOrRef = genOrRef;
	}
	
	public static void isGenOrRefPointer(String genOrRef) {
		if(genOrRef.toLowerCase().equals("general")) {
			System.out.println("You can look for general books in our GeneralBook section.");
		} else if(genOrRef.toLowerCase().equals("reference")) {
			System.out.println("You can look for reference books in our ReferenceBook section.");
		} else {
			System.out.println("You need to specify \"Reference\" or \"General\".");
		}
	}
}
