package utils;

import bean.Book;

public class BookQuery {
	private BookQuery() {
	}
	
	public static void getBookByPublisher(Book[] listBook, String publisher) {
		for (int i = 0; i < listBook.length; i++) {
			if (listBook[i].getPublisher().equals(publisher)) {
				System.out.println(listBook[i]);
			}
		}
	}
	
	public static void getBookByMaxPrice(Book[] listBook, double price) {
		for (int i = 0; i < listBook.length; i++) {
			if (listBook[i].getPrice() < price) {
				System.out.println(listBook[i]);
			}
		}
	}
	
	public static void getTextBookByPriceRange(Book[] listBook, double min, double max) {
		for (int i = 0; i < listBook.length; i++) {
			if (listBook[i].getPrice() <= max && listBook[i].getPrice() >= min && listBook[i].getId().substring(0, 3).equals("SGK")) {
				System.out.println(listBook[i]);
			}
		}
	}
	
	public static double getTotal(Book[] listBook) {
		double total = 0;
		for (int i = 0; i < listBook.length; i++) {
			total += listBook[i].getPrice();
		}
		return total;
	}
}
