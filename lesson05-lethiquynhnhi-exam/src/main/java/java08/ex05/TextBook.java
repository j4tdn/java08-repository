package java08.ex05;

public class TextBook extends Book {
    private StatusBook status;

    public TextBook() {
    }

    public TextBook(String id, double pice, String publisher, StatusBook status) {
        super(id, pice, publisher);
        this.status = status;
    }

    public StatusBook getStatus() {
        return status;
    }

    public void setStatus(StatusBook status) {
        this.status = status;
    }
}
