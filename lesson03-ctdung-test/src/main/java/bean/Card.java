package bean;

import java.time.LocalDate;

public class Card {
	private String id;
	private LocalDate from;

	private Book[] sach;
	private Student svien;
	
	public Card() {
		
	}
	
	public Card(String id, LocalDate from, Book[] sach, Student svien) {
		super();
		this.id = id;
		this.from = from;
		
		this.sach = sach;
		this.svien = svien;
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

	

	

	public Book[] getSach() {
		return sach;
	}

	public void setSach(Book[] sach) {
		this.sach = sach;
	}

	public Student getSvien() {
		return svien;
	}

	public void setSvien(Student svien) {
		this.svien = svien;
	}

	
	
	
}
