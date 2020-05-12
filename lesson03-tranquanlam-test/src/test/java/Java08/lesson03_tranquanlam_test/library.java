package Java08.lesson03_tranquanlam_test;

import java.time.LocalDate;
import java.time.Month;

import bean.Book;
import bean.Card;
import bean.Student;

public class library {

	public static void main(String[] args) {
		Student student01 = new Student("Lam", 12, "16cnnt1");
		Student student02 = new Student("An", 13, "16cnnt2");
		Student student03 = new Student("Nam", 14, "16cnnt3");

		Book book1 = new Book(1, "Ban tai gioi toi cung the", "Bear");
		Book book2 = new Book(2, "Tren Duong Bang", "Tony");
		Book book3 = new Book(3, "Tony buoi sang", "Tim");

		Book[] bookArray1 = { book1, book2 };
		Book[] bookArray2 = { book2, book3 };
		Book[] bookArray3 = { book1, book3 };

		Card card01 = new Card(1, LocalDate.of(2020, Month.MAY, 22), LocalDate.of(2020, Month.JULY, 22), bookArray1,
				student01);
		Card card02 = new Card(2, LocalDate.of(2020, Month.MAY, 22), LocalDate.of(2020, Month.JULY, 22), bookArray2,
				student02);
		Card card03 = new Card(3, LocalDate.of(2020, Month.MAY, 22), LocalDate.of(2020, Month.JULY, 22), bookArray3,
				student03);
		
		System.out.println(student01.toString());
		System.out.println(card01.toString());
		System.out.println("==========================");
		System.out.println(student02.toString());
		System.out.println(card02.toString());
		System.out.println("==========================");
		System.out.println(student03.toString());
		System.out.println(card03.toString());
	}

}
