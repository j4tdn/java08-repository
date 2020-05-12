package java08.lesson03_nguyenphuoctam_test;

public class Book {
	private String idBook;
	private String name;
	private String publishingCompany;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String idBook, String name, String publishingCompany) {
		super();
		this.idBook = idBook;
		this.name = name;
		this.publishingCompany = publishingCompany;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", name=" + name + ", publishingCompany=" + publishingCompany + "]";
	}
	
}
