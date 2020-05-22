
public class LibraryItemFactory {
	// ItemType enum
	public enum ItemType {
		GENERAL_BOOK, REFERENCE_BOOK, MAGAZINE, NEWSPAPER
	}
	// constructor
	public static LibraryItem createLibraryItem(ItemType itemType) {
		switch(itemType) {
			case GENERAL_BOOK:
				return new GeneralBook();
			case REFERENCE_BOOK:
				return new ReferenceBook();
			case MAGAZINE:
				return new Magazine();
			case NEWSPAPER:
				return new Newspaper();
			default:
				return null;
		}
	}
}
