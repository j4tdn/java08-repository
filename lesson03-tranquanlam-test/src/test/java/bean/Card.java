package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Card {
	private int codeCart;
	private LocalDate dayStart;
	private LocalDate dayEnd;
	private Book[] book;
	private Student student;

	public Card(int codeCart, LocalDate dayStart, LocalDate dayEnd, Book[] book, Student student) {
		super();
		this.codeCart = codeCart;
		this.dayStart = dayStart;
		this.dayEnd = dayEnd;
		this.book = book;
		this.student = student;
	}

	public int getCodeCart() {
		return codeCart;
	}

	public void setCodeCart(int codeCart) {
		this.codeCart = codeCart;
	}

	public LocalDate getDayStart() {
		return dayStart;
	}

	public void setDayStart(LocalDate dayStart) {
		this.dayStart = dayStart;
	}

	public LocalDate getDayEnd() {
		return dayEnd;
	}

	public void setDayEnd(LocalDate dayEnd) {
		this.dayEnd = dayEnd;
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Card [codeCart=" + codeCart + ", dayStart=" + dayStart + ", dayEnd=" + dayEnd + ", book="
				+ Arrays.toString(book) + ", student=" + student + "]";
	}

}
