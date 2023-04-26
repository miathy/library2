package library2;

public class Book {
	String name;
	String isbn;
	String author;
	static int stock;
	String location;
	Type type;
	static boolean isReturned;

	public static int checkStock(Book book) {
		int currentStock = book.stock;
		if (isReturned == false)
			currentStock -= 1;

		else
			currentStock += 1;

		return currentStock;
	}

}
