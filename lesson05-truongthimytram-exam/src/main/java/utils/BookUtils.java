package utils;

import bean.Book;

public class BookUtils {
	public static void findPublisher(Book[] books) {
		for (Book book : books) {
			if(book.getPublisher() == "NhiDong") System.out.println(book);
		}
		
	}
	public static void findBook(Book[] books) {
		for (Book book : books) {
			if(book.getPrice() < 50) System.out.println(book);
		}
	}
	public static void findReferenceBook(Book[] books) {
		for (Book book : books) {
			if(book.getId().startsWith("SGK") && book.getPrice() >= 100 && book.getPrice() <= 200) System.out.println(book);
		}
		
	}
	public double calTotalPrice(Book[] books) {
		double total;
		for (Book book : books) {
			if(book.getId().startsWith("SGK")) total += book.getPrice()*0.7;
			if(book.getId().startsWith("STK")) total += book.getPrice(1+book.getTax());
		}
		
	}

}
