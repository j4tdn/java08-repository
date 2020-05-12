package bean;

import java.time.LocalDate;

public class Card {
	private String id;
	private LocalDate from;
	private LocalDate to;
	private Book[] book;
	private Student student;

	public Card() {
		// TODO Auto-generated constructor stub
	}

	public Card(String id, LocalDate from, LocalDate to, Book[] book, Student student) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.book = book;
		this.student = student;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return "id: " + id + " \nnFrom: " + from + " \nto: : " + to + " \nBook: " + book
				+ " \nStudent: " + student;
	}
}
