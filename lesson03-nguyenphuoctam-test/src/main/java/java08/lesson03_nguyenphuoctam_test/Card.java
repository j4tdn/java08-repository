package java08.lesson03_nguyenphuoctam_test;

import java.time.LocalDate;
import java.util.List;

public class Card {
	private String id;
	private LocalDate borrowDate;
	private LocalDate datePayDate;
	private List<String> idBook;
	private String idStudent;
	
	public Card() {
		// TODO Auto-generated constructor stub
	}

	public Card(String id, LocalDate borrowDate, LocalDate datePayDate, List<String> idBook, String idStudent) {
		super();
		this.id = id;
		this.borrowDate = borrowDate;
		this.datePayDate = datePayDate;
		this.idBook = idBook;
		this.idStudent = idStudent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}

	public LocalDate getDatePayDate() {
		return datePayDate;
	}

	public void setDatePayDate(LocalDate datePayDate) {
		this.datePayDate = datePayDate;
	}

	public List<String> getIdBook() {
		return idBook;
	}

	public void setIdBook(List<String> idBook) {
		this.idBook = idBook;
	}

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	@Override
	public String toString() {
		return "card [id=" + id + ", borrowDate=" + borrowDate + ", datePayDate=" + datePayDate + ", idBook=" + idBook
				+ ", idStudent=" + idStudent + "]";
	}
	
}
