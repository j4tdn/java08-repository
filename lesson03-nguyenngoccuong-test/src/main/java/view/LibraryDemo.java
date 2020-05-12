package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Book;
import bean.Card;
import bean.Student;
import utils.CardUtils;

public class LibraryDemo {
	public static void main(String[] args) {
		
		Student student1 = new Student("Student Name 1", 21, "16T1");
		Student student2 = new Student("Student Name 2", 22, "16T2");
		Student student3 = new Student("Student Name 3", 23, "16T3");
		
		Book book1 = new Book(1, "Name 1", "Publisher 1");
		Book book2 = new Book(2, "Name 2", "Publisher 2");
		Book book3 = new Book(3, "Name 3", "Publisher 3");
		Book book4 = new Book(4, "Name 4", "Publisher 4");
		
		Book[] listBook1 = {book1, book2, book3};
		Book[] listBook2 = {book2, book3, book4};
		Book[] listBook3 = {book3, book4, book1};
		
		Card card1 = new Card(1, LocalDate.of(2020, Month.APRIL, 1), LocalDate.of(2020, Month.APRIL, 6), listBook1, student1);
		Card card2 = new Card(2, LocalDate.of(2020, Month.MAY, 1), LocalDate.of(2020, Month.MAY, 6), listBook2, student2);
		Card card3 = new Card(3, LocalDate.of(2020, Month.JUNE, 1), LocalDate.of(2020, Month.JUNE, 6), listBook3, student3);
		
		CardUtils.showCard(card1, card2, card3);
		
	}
	
	
}
