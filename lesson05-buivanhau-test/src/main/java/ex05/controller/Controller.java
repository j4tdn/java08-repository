package ex05.controller;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

import ex05.bean.Book;
import ex05.bean.ReferenceBook;
import ex05.bean.TextBook;

public class Controller {

	public List<TextBook> createDataTextBook() {
		List<TextBook> textBooks = new ArrayList<TextBook>();
		TextBook textBook1 = new TextBook("01", 50, "Nhi Dong", false);
		TextBook textBook2 = new TextBook("02", 100, "Kim Dong");
		TextBook textBook3 = new TextBook("03", 150, "Phu Dong", false);
		textBooks.add(textBook1);
		textBooks.add(textBook2);
		textBooks.add(textBook3);
		return textBooks;
	}

	public List<ReferenceBook> createDataReferenceBook() {
		List<ReferenceBook> referenceBooks = new ArrayList<ReferenceBook>();
		ReferenceBook referenceBook1 = new ReferenceBook("01", 50, "Nhi Dong", 0.1);
		ReferenceBook referenceBook2 = new ReferenceBook("02", 100, "Kim Dong", 0.2);
		ReferenceBook referenceBook3 = new ReferenceBook("03", 150, "Phu Dong", 0.3);
		referenceBooks.add(referenceBook1);
		referenceBooks.add(referenceBook3);
		referenceBooks.add(referenceBook2);
		return referenceBooks;
	}

	public List<Book> createData(List<TextBook> textBooks, List<ReferenceBook> referenceBooks) {
		List<Book> books = new ArrayList<Book>();
		books.addAll(textBooks);
		books.addAll(referenceBooks);
		return books;
	}

	public List<Book> findByCompany(List<Book> books, String name) {
		List<Book> result = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getCompany().equals(name)) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> findBySmallerPrice(List<Book> books, double price) {
		List<Book> result = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getPrice() < price) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> findByFromToPrice(List<Book> books, double fromPrice, double toPrice) {
		List<Book> result = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getPrice() <= toPrice && book.getPrice() >= fromPrice) {
				result.add(book);
			}
		}
		return result;
	}

	public double pay(Book... books) {
		double total = 0;
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook textBook = (TextBook) book;
				total += textBook.isStatus() ? textBook.getPrice() : textBook.getPrice() * 0.7;
			} else if (book instanceof ReferenceBook) {
				ReferenceBook referenceBook = (ReferenceBook) book;
				total += referenceBook.getPrice() * (1 + referenceBook.getTax());
			}
		}
		return total;
	}

}
