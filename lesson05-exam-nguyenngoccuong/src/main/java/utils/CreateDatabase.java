package utils;

import bean.Book;
import bean.BookFactory;

public class CreateDatabase {
	private CreateDatabase() {
	}
	
	public static Book[] createBook() {
		Book book1 = BookFactory.get("SGK001", 40, "NXB", true, 0);
		Book book2 = BookFactory.get("SGK002", 20, "Nhi Dong", false, 0);
		Book book3 = BookFactory.get("SGK003", 150.000, "NXB", true, 0);
		Book book4 = BookFactory.get("STK001", 10, "NXB", true, 0);
		Book book5 = BookFactory.get("STK002", 150.000, "Nhi Dong", true, 0);
		return new Book[] {book1, book2, book3, book4, book5};
	}
}
