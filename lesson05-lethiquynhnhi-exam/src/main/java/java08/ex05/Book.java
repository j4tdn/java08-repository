package java08.ex05;

public class Book {
    private String id;
    private double pice;
    private String publisher;

    public Book() {
    }

    public Book(String id, double pice, String publisher) {
        this.id = id;
        this.pice = pice;
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPice() {
        return pice;
    }

    public void setPice(double pice) {
        this.pice = pice;
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
                ", pice=" + pice +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
