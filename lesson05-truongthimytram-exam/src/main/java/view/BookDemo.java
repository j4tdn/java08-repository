package view;

import bean.Bill;
import bean.Book;
import bean.Client;
import bean.ReferenceBook;
import bean.TextBook;
import utils.BookUtils;

public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new TextBook("SGK01", 20, "Nhi dong", "old");
		Book b2 = new ReferenceBook("STK02", 30, "Kim dong", 15);
		
		Client client = new Client("C01", "Anna", 977392630, "Lien Chieu");
		
		Book[] books = {b1, b2};
		
		Bill bill = new Bill(client, books);
		
		System.out.println("total charge: " + bill.toString());
		
		BookUtils.findBook(books);
		System.out.println("=======================");
		BookUtils.findPublisher(books);
		System.out.println("=======================");
		BookUtils.findReferenceBook(books);
		

	}

}
