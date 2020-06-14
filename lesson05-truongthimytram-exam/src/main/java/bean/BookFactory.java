package bean;

public class BookFactory {
	private BookFactory() {
		
	}
	public static Book get(TypeOfBook type) {
		Book book = null;
		switch (type) {
		case TEXT:
			book = new TextBook();	
			break;
		case REF:
			book = new ReferenceBook();
			break;
		default:
			book = new Book();
			break;
		}
		return book;
	}

}
