package java08.view;

import java08.bean.Book;
import java08.bean.Card;
import java08.bean.Student;
import java08.utils.CardUtils;

import java.time.LocalDate;
import java.time.Month;

public class LibraryDemo {
    public static void main(String[] args) {
        Student nhi = new Student("Nhi", 23, "16T1");
        Student vu = new Student("Vu", 23, "16T3");
        Student tram = new Student("Tram", 22, "16T2");

        Book book1 = new Book("1", "Giai tich 2", "Kim Dong");
        Book book2 = new Book("2", "Vat li 2", "Kim Dong");
        Book book3 = new Book("3", "Dai so", "Kim Dong");

        Book[] bookBorrowedNhi = {book1, book2};
        Book[] bookBorrowedVu = {book1, book3};
        Book[] bookBorrowedTram = {book2, book3};

        Card card1 = new Card("1", LocalDate.of(2020, Month.MAY, 12), LocalDate.of(2020, Month.MAY, 12).plusDays(5), bookBorrowedNhi, nhi);
        Card card2 = new Card("2", LocalDate.of(2020, Month.MAY, 12), LocalDate.of(2020, Month.MAY, 12).plusDays(5), bookBorrowedVu, vu);
        Card card3 = new Card("3", LocalDate.of(2020, Month.MAY, 12), LocalDate.of(2020, Month.MAY, 12).plusDays(5), bookBorrowedTram, tram);
        CardUtils.exportCard(card1, card2, card3);
    }
}
