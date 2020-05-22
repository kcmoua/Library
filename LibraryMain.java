
public class LibraryMain {

	public static void main(String[] args) {
		Author author1 = new Author("Stephen", "King");
		System.out.println(author1.getAuthor());
		
		LibraryItem lib1 = LibraryItemFactory.createLibraryItem(LibraryItemFactory.ItemType.NEWSPAPER);
		lib1.setAuthor(author1);
	}

}
