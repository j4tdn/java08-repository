package bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Card {
	private String id;
	private LocalDate startDate;
	private LocalDate expireDate;
	private Book[] books;
	private Student student;

	public Card() {
		// TODO Auto-generated constructor stub
	}

	public Card(String id, LocalDate startDate, LocalDate expireDate, Book[] books, Student student) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.expireDate = expireDate;
		this.books = books;
		this.student = student;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Phiếu mượn: " + id + ", startDate=" + startDate + ", expireDate=" + expireDate + ", books="
				+ Arrays.toString(books) + ", student=" + student + "]";
	}
	
	

}
