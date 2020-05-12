package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Book;
import bean.Card;
import bean.Student;
import utils.CardUtils;

public class LibraryDemo {
	public static void main(String[] args) {
		Book book1 = new Book("b.01", "Harry Potter 1", "NXB Kim Dong");
		Book book2 = new Book("b.02", "Mắt biếc", "NXB Da Nang");
		Book book3 = new Book("b.03", "Thơ Tố Hữu", "NXB Da Nang");
		Book book4 = new Book("b.04", "Toán cao cấp", "NXB Sư phạm");

		Student vu = new Student("Huy Vu", 23, "16T2");
		Student nhi = new Student("Quynh Nhi", 22, "16T1");
		Student tram = new Student("My Tram", 23, "16T3");

		Book[] booksOfVu = { book1, book2 };
		Book[] booksOfNhi = { book3, book4 };
		Book[] booksOfTram = { book1, book3, book4 };

		LocalDate startDate = LocalDate.of(2020, Month.MAY, 12);

		Card cardOfVu = new Card("c.01", startDate, startDate.plusDays(5), booksOfVu, vu);
		Card cardOfNhi = new Card("c.02", startDate, startDate.plusDays(7), booksOfVu, nhi);
		Card cardOfTram = new Card("c.03", startDate, startDate.plusDays(6), booksOfVu, tram);

		CardUtils.showCard(cardOfNhi, cardOfTram, cardOfVu);
	}

}
