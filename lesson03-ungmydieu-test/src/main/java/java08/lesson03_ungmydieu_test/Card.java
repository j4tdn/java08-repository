package java08.lesson03_ungmydieu_test;

import java.time.LocalDate;

public class Card {
	private int id;
	private LocalDate from;
	private LocalDate to;
	private Book[] books;
	private Student student;
	
	public Card() {}

	public Card(int id, LocalDate from, LocalDate to, Book[] books, Student student) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.books = books;
		this.student = student;
	}
	
	@Override
	public String toString() {		
		String result = new String();
		result = "Card : " + this.getId() + ", " + this.getFrom() + ", " + this.getTo() + this.student.toString();
		for (Book book : this.books) {
			result += book.toString();
		}
			
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

	public Book[] getBook() {
		return books;
	}

	public void setBook(Book[] books) {
		this.books = books;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
