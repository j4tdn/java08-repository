package java08.lesson03_hominhduong_test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import bean.Book;
import bean.Card;
import bean.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Student student1 = new Student("Nguyen Van A", 18, "IT1");
		Student student2 = new Student("Nguyen Van B", 19, "IT1");
		Student student3 = new Student("Nguyen Van AB", 20, "IT4");
		Student student4 = new Student("Nguyen Van AC", 19, "IT2");
		Student student5 = new Student("Nguyen Van AD", 18, "IT3");

		Book book1 = new Book("b12", "Ngay xua ngay xua", "Kim Dong");
		Book book2 = new Book("b11", "Ngay xua ngay xua 4", "Kim Dong 5");
		Book book3 = new Book("b13", "Ngay xua ngay xua 2", "Kim Vang");
		Book book4 = new Book("b14", "Ngay xua ngay xua 5", "Kim Da");
		Book book5 = new Book("b15", "Ngay xua ngay xua 6", "Kim Dong 1");
		Book book6 = new Book("b17", "Ngay xua ngay xua 7", "Kim Dong 2");
		Book book7 = new Book("b16", "Ngay xua ngay xua 9", "Kim Dong 4");

		List<Book> list1 = new ArrayList<Book>();
		list1.add(book7);
		list1.add(book2);

		List<Book> list2 = new ArrayList<Book>();
		list2.add(book7);
		list2.add(book2);
		list2.add(book5);
		list2.add(book3);
		
		

		Card card1 = new Card("c1", LocalDate.of(2020, Month.MAY, 10), list1, student1);
		Card card2 = new Card("c2", LocalDate.of(2020, Month.MAY, 5), list2, student2);
		
		showliscard(card1, card2);
	}
	
	public static void showliscard(Card ...cards) {
		for (Card card : cards) {
			System.out.println("=======================================");
			System.out.println("id card:\t"+card.getId());
			System.out.println("");
		}
	}
}
