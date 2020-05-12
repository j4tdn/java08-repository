package java08.bean;

import java.time.LocalDate;

public class Card {

    private String id;
    private LocalDate date;
    private LocalDate endDate;
    private Book[] books;
    private Student student;

    public Card() {
    }

    public Card(String id, LocalDate date, LocalDate endDate, Book[] books, Student student) {
        this.id = id;
        this.date = date;
        this.endDate = endDate;
        this.books = books;
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
}
