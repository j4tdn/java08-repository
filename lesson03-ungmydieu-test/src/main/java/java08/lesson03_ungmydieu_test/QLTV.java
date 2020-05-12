package java08.lesson03_ungmydieu_test;

import java.time.LocalDate;
import java.time.Month;

public class QLTV {
	static int idCard = 0;
	
	public Card borrow(Student student, Book...books ) {
		Card card = new Card();
		card.setId(idCard++);
		card.setFrom(LocalDate.now());
		card.setTo(LocalDate.now());
		card.setBook(books);
		card.setStudent(student);
		return card;
	}
}
