package bean;

import java.time.LocalDate;
import java.util.List;

public class Card {
	private String id;
	private LocalDate borrowDay;
	private LocalDate returnDay;
	private List<Book> listBook;
	private Student student;

	public Card(String id, LocalDate borrowDay, List<Book> listBook, Student student) {
		super();
		this.id = id;
		this.borrowDay = borrowDay;
		this.listBook = listBook;
		this.student = student;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getBorrowDay() {
		return borrowDay;
	}

	public void setBorrowDay(LocalDate borrowDay) {
		this.borrowDay = borrowDay;
	}

	public LocalDate getReturnDay() {
		return this.borrowDay.plusDays(5);
	}

	public void setReturnDay(LocalDate returnDay) {
		this.returnDay = returnDay;
	}

	public List<Book> getListBook() {
		return listBook;
	}

	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + "\nborrowDay=" + borrowDay + ", returnDay=" + getReturnDay() + "\n\t\tlistBook=" + listBook
				+ "\nstudent=" + student + "]";
		
	}

}
