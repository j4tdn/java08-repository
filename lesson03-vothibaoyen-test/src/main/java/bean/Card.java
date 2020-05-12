package bean;

import java.time.LocalDate;



public class Card {
	private String id;
	private LocalDate ngaymuon;
	private LocalDate ngaytra;
	private Student student;
	private Book[] books;
	
	
	public Card() {
		
	}


	public Card(String id, LocalDate ngaymuon, LocalDate ngaytra, Student student, Book[] books) {
		super();
		this.id = id;
		this.ngaymuon = ngaymuon;
		this.ngaytra = ngaytra;
		this.student = student;
		this.books = books;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public LocalDate getNgaymuon() {
		return ngaymuon;
	}


	public void setNgaymuon(LocalDate ngaymuon) {
		this.ngaymuon = ngaymuon;
	}


	public LocalDate getNgaytra() {
		return ngaytra;
	}


	public void setNgaytra(LocalDate ngaytra) {
		this.ngaytra = ngaytra;
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

	public static void export(Card bill) {
		System.out.println("===================================");
		System.out.println("Ho ten: "+bill.getStudent().getName());
		
		System.out.println("Danh sach sach ");
		Book[] items=bill.getBooks();
		
		
		for(Book item:items) {
			System.out.println(item);
		}
		
	}
	
	
}
