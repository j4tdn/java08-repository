package oop;

import java.util.ArrayList;
import java.util.List;

public class BookUtils {
	private BookUtils() {
		// TODO Auto-generated constructor stub
	}

	public static Book[] mockData() {
		Book[] books = new Book[5];

		Book bookMath = new SchoolBook("SGK1", 200, BookStatus.NEW, "NXB Nhi Dong");
		books[0] = bookMath;

		Book bookChemistry = new SchoolBook("SGK2", 150, BookStatus.OLD, "NXB Nhi Dong");
		books[1] = bookChemistry;

		Book bookHistory = new SchoolBook("SGK3", 40, BookStatus.NEW, "NXB Giao Duc");
		books[2] = bookHistory;

		Book referenceGeo = new ReferenceBook("STK1", 300, "NXB Nhi Dong", 0.3);
		books[3] = referenceGeo;

		Book referencePhys = new ReferenceBook("STK2", 400, "NXB Nhi Dong", 0.3);
		books[4] = referencePhys;

		return books;
	}

	public static List<Book> findAllBooksFromPublisher(Book[] books, String publisher) {
		List<Book> bookFromPublisher = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getPublisherOfBook().equals(publisher)) {
				bookFromPublisher.add(book);
			}
		}

		return bookFromPublisher;
	}

	public static List<Book> findAllBooksHavePriceLess50(Book[] books) {
		List<Book> booksHavePriceLess50 = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getPriceOfBook() < 50) {
				
				booksHavePriceLess50.add(book);
			}
		}

		return booksHavePriceLess50;
	}

	public static List<SchoolBook> findAllSchoolBooksHavePriceFrom100To200(Book[] books) {
		List<SchoolBook> schoolBooks = new ArrayList<SchoolBook>();

		for (Book book : books) {
			if (book instanceof SchoolBook && book.getPriceOfBook() >= 100 && book.getPriceOfBook() <= 200) {
				schoolBooks.add((SchoolBook) book);
			}
		}

		return schoolBooks;
	}
	
	
}
