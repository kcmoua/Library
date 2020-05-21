
public class GeneralBook extends Book {
	
	private String genre;
	
	public GeneralBook(String title, String author, int isbn, int pages, String condition, String genOrRef, String genre) {
		super(title, author, isbn, pages, condition, genOrRef);
		this.genre = genre;
	}
	// getters
	public String getGenre() {
		return this.genre;
	}
	// setters
	public void setGenre(String type) {
		this.genre = genre;
	}
	
	public static void isGenre(String genre) {
		if(genre.toLowerCase().equals("anime")) {
			System.out.println("Sorry, we do not carry the genre: " + genre + ".");
		} else {
			System.out.println("Yes, we have a wide selection of the genre: " + genre + ".");
		}
	}
}
