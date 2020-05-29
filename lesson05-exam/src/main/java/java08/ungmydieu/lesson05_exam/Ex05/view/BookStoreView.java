package java08.ungmydieu.lesson05_exam.Ex05.view;

import java.util.ArrayList;

import java08.ungmydieu.lesson05_exam.Ex05.beans.Book;
import java08.ungmydieu.lesson05_exam.Ex05.beans.BookID;
import java08.ungmydieu.lesson05_exam.Ex05.beans.ReferenceBook;
import java08.ungmydieu.lesson05_exam.Ex05.beans.TextBook;
import java08.ungmydieu.lesson05_exam.Ex05.utils.BookStore;

public class BookStoreView {
	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		ArrayList<Book> books = new ArrayList<Book>();
		
		System.out.println("All book:");
		bookStore.Show();
		
		System.out.println("\nBooks is from Nhi Đồng company:");
		books = bookStore.findBookByCompany("Nhi Đồng");		
		for (Book book : books) {
			System.out.println(book);
		}
		
		System.out.println("\nBooks have price less than 50VND:");
		books = bookStore.findBookLessByPrice(50);	
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println("\nBooks have price from 100VND to 200VND:");
		books = bookStore.findBookByPrice();	
		for (Book book : books) {
			System.out.println(book);
		}
		
		Book book1 = new TextBook(BookID.SGK + "02", 60, "Nhi Đồng", false);
		Book book2 = new ReferenceBook(BookID.STK + "01", 70, "Nhi Đồng", 0.2);
		System.out.println("\nTinh tien: ");
		System.out.println("   + " + book1.toString());
		System.out.println("   + " + book2.toString());
		System.out.println("total price: " + bookStore.totalPrice(book1, book2));
	}
}
