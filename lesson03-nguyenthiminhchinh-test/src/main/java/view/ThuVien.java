package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Book;
import bean.Card;
import bean.Student;

public class ThuVien {

	public static void main(String[] args) {
		Book book1 = new Book("1", "A", "nxb1");
		Book book2 = new Book("2", "B", "nxb2");
		Book book3 = new Book("3", "C", "nxb3");

		Student student1 = new Student("Nguyen", 18, "12C");
		Student student2 = new Student("Thi", 20, "11X");
		Student student3 = new Student("Van", 24, "17C");

		Book[] firstBook = { book1, book2, book3 };
		Book[] secondBook = { book1, book3 };

		Card firstCard = new Card("1", LocalDate.of(2020, Month.MAY, 12), LocalDate.of(2020, Month.DECEMBER, 13),
				firstBook, student1);
		export(firstCard);
	}

	public static void export(Card card) {
		System.out.println("=============");
		System.out.println("Ho ten sinh vien: " + card.getStudent().getName());

		System.out.println("Danh sach sach muon:");
		Book[] books = card.getBook();

		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("=============");
	}

}
