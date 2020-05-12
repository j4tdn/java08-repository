package bean;

import java.time.LocalDate;

public class Card {
	private String id;
	private Student student;
	private Book[] books;
	private LocalDate from;
	private LocalDate to;
	
	public Card(String id, Student student, Book[] books, LocalDate from, LocalDate to) {
		super();
		this.id = id;
		this.student = student;
		this.books = books;
		this.from = from;
		this.to = to;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
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
	
	

}
