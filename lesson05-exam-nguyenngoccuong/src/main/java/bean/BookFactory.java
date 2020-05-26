package bean;

public class BookFactory {
	private BookFactory() {
	}

	public static Book get(String id, double price, String publisher, boolean condition, int tax) {
		Book book = null;
		String code = id.substring(0, 3);
		switch (code) {
		case "SGK":
			book = new TextBook(id, price, publisher, condition);
			break;
		case "STK":
			book = new ReferenceBook(id, price, publisher, tax);
			break;
		default:
			//book = new Book();
			return book;
		}
		return book;
	}
}
