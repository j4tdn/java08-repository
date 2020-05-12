package View;

import java.time.LocalDate;
import java.time.Month;

import Bean.Book;
import Bean.Card;
import Bean.CardUtils;
import Bean.Student;

public class App {

	public static void main(String[] args) {
		
		Book book1 = new Book("01","doreamon","nhi dong");
		Book book2 = new Book("02","conan", "tuoi tre");
		
		Student phd = new Student("phan huynh duc",20,"17T3");
		
		//CardUtils.display(phd, book1,book2);
		Card app = new Card("01",LocalDate.of(2020,Month.MAY,12),LocalDate.of(2020,Month.MAY,12), phd, book1);
		app.display();
	}

}
