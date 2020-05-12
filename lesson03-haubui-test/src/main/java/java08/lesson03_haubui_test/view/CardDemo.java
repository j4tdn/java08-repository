package java08.lesson03_haubui_test.view;

import java.time.LocalDate;

import java08.lesson03_haubui_test.bean.Book;
import java08.lesson03_haubui_test.bean.Card;
import java08.lesson03_haubui_test.bean.Student;

public class CardDemo {
	public static void main(String[] args) {
		Student student1 = new Student("hau", 23, "15T1");
		Student student2 = new Student("hung", 18, "15T2");
		Student student3 = new Student("hieu", 20, "15T3");

		Book book1 = new Book("book01", "aaaaaaaaa", "abc");
		Book book2 = new Book("book01", "aaaaaaaaa", "abc");
		Book book3 = new Book("book01", "aaaaaaaaa", "abc");

		Card card1 = borrow("Card01", student1, book1, book2);
		Card card2 = borrow("Card02", student2, book3);
		Card card3 = borrow("Card03", student3, book1, book3);
	
		printCard(card1);
		printCard(card2);
		printCard(card3);
		
	}

	public static Card borrow(String cardID, Student student, Book... books) {
		return new Card(cardID, LocalDate.now(), books, student);
	}

	public static void printCard(Card card) {
		System.out.println("===========================================\n");
		System.out.println(card);
	}
}
