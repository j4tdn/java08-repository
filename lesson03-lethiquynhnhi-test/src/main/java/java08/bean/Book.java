package java08.bean;

public class Book {
    private String id;
    private String nameBook;
    private String publisher;

    public Book() {
    }

    public Book(String id, String nameBook, String publisher) {
        this.id = id;
        this.nameBook = nameBook;
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
