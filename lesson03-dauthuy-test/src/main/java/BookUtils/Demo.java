package BookUtils;

import java.time.LocalDate;

import bean.Book;
import bean.Card;
import bean.Student;

public class Demo {
	public static void main(String[] args) {
		Student student1 = new Student("DauThuy", 21, "17C2");
		Student student2 = new Student("MinhChinh", 21, "17C2");
		
		Book book1 = new Book("12dt1", "TiengViet", "KimDong");
		Book book2 = new Book("12dt2", "Toan", "ThieuNhi");
		
		Card card1 = new Card("01", LocalDate.of(2020, 05, 10), LocalDate.of(2020, 05, 20), book1, student1);
		Card card2 = new Card("02", LocalDate.of(2020, 05, 10), LocalDate.of(2020, 05, 20), book2, student2);
		
		
		
		System.out.println(card1);
		System.out.println("-----------------");
		System.out.println(card2);
		
	}
}
