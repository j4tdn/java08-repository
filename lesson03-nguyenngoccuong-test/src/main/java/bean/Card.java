package bean;

import java.time.LocalDate;

public class Card {
	private int id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Book[] books;
	private Student student;
	
	public Card() {
	}
	
	public Card(int id, LocalDate startDate, LocalDate endDate, Book[] books, Student student) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.books = books;
		this.student = student;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
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
	
	
}
