package view;

import java.time.LocalDate;
import java.time.Month;

import Utils.CardUtils;
import bean.Book;
import bean.Card;
import bean.Student;

public class Demo {
	public static void main(String[] args) {
	
	// Sinh Vien
	Student sd1 = new Student("Nguyen Van A", "18", "18T3");
	Student sd2 = new Student("Nguyen Van B", "20", "15T3");
	Student sd3 = new Student("Nguyen Van C", "13", "15T3");
	
	// Book
	Book b1 = new Book("01", "Nothing1", "Omega");
	Book b2 = new Book("02", "Nothing2", "Omega2");
	Book b3 = new Book("03", "Nothing3", "Omega");
	Book b4 = new Book("04", "Nothing4", "Omega1");
	
	Book[]	book1 = {b1, b3	};
	Book[]	book2 = {b1,b2 , b4, b3};
	Book[]	book3 = {b1, b4	};
	
	
	Card c1 = new Card("C-01", LocalDate.of(2020, Month.JULY, 27), book2, sd1);
	CardUtils.export(c1);
	
	
}
}
