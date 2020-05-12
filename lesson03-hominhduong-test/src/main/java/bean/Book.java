package bean;

public class Book {
	private String idBook;
	private String nameBook;
	private String publicBook;
	
	public Book(String idBook, String nameBook, String publicBook) {
		super();
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.publicBook = publicBook;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getPublicBook() {
		return publicBook;
	}

	public void setPublicBook(String publicBook) {
		this.publicBook = publicBook;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", nameBook=" + nameBook + ", publicBook=" + publicBook + "]";
	}
	
	
	
	
	
}
