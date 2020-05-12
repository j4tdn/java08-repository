package java08.lesson03_haubui_test.bean;

import java.time.LocalDate;
import java.util.Arrays;

public class Card {
	private String id;
	private LocalDate fDate;
	private LocalDate tDate;
	private Book[] books;
	private Student student;

	public Card() {
	}

	public Card(String id, LocalDate fDate, Book[] books, Student student) {
		this.id = id;
		this.fDate = fDate;
		this.tDate = fDate.plusDays(5);
		this.books = books;
		this.student = student;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getfDate() {
		return fDate;
	}

	public void setfDate(LocalDate fDate) {
		this.fDate = fDate;
	}

	public LocalDate gettDate() {
		return tDate;
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
		return "ma the: " + id + "\nNgay thue: " + fDate + "\nNgay tra: " + tDate + "\nSach thue: " + Arrays.toString(books)
				+ "\nhoc sinh: " + student ;
	}

}
