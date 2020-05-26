package view;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new TextBook(id, price, publisher, status);
		Book b2 = new TextBook(id, price, publisher, status);
		Book b3 = new TextBook(id, price, publisher, status);
		Book b4 = new ReferenceBook(id, price, publisher, tax);
		Book b5 = new ReferenceBook(id, price, publisher, tax);
		Book[] books = {b1, b2, b3, b4, b5};
		

	}

}
