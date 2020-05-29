package java08.ungmydieu.lesson05_exam.Ex05.utils;

import java.awt.List;
import java.util.ArrayList;

import java08.ungmydieu.lesson05_exam.Ex05.beans.Book;
import java08.ungmydieu.lesson05_exam.Ex05.beans.BookID;
import java08.ungmydieu.lesson05_exam.Ex05.beans.ReferenceBook;
import java08.ungmydieu.lesson05_exam.Ex05.beans.TextBook;

public class BookStore {
	
	ArrayList<Book> store = new ArrayList<Book>();
	
	public BookStore() {
		store.add(new TextBook(BookID.SGK + "01", 60, "Giáo Dục", true));
		store.add(new TextBook(BookID.SGK + "02", 120, "Nhi Đồng", true));
		store.add(new TextBook(BookID.SGK + "03", 30, "Nhi Đồng", true));
		
		store.add(new ReferenceBook(BookID.STK + "01", 70, "Nhi Đồng", 0.2));
		store.add(new ReferenceBook(BookID.STK + "02", 30, "Hồng Hà", 0.1));
	}
	
	public void Show() {
		for (Book book : store) {
			System.out.println(book.toString());
		}
	}
	
	public ArrayList<Book> findBookByCompany(String company) {
		ArrayList<Book> books = new ArrayList<Book>();
		
		for (Book b : store) {
			if (b.getCompany().equals(company)) books.add(b);
		}
		
		return books;
	}
	
	public ArrayList<Book> findBookLessByPrice(double price) {
		ArrayList<Book> books = new ArrayList<Book>();
		
		for (Book b : store) {
			if (b.getPrice() <= price) books.add(b);
		}
		
		return books;
	}
	
	public ArrayList<Book> findBookByPrice() {
		ArrayList<Book> books = new ArrayList<Book>();
		
		for (Book b : store) {
			if (b.getPrice() > 100 && b.getPrice() < 200 && b.getId().matches("SGK.*")) books.add(b);
		}
		
		return books;
	}
	
	public double totalPrice(Book...books ) {
		if (books.length == 0) return 0;

		double total = 0;	
		for (Book b : books) {
			double price = 0;
			total += b.getPrice();			
		}
		
		return total;
	}
}
