package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Book;
import bean.Card;
import bean.Student;
import utils.CardUtils;

public class LibraryManagement {

	public static void main(String[] args) {
		Book toan = new Book("1", "toán", "nxbHN");
		Book hoa = new Book("2", "hóa", "nxbHN");
		Book ly = new Book("3", "lý", "nxbHN");
		Book[] list1 = {toan, hoa, ly};	
		Book[] list2 = {toan, hoa};	
		Student tram = new Student("Trương Thị Mỹ Trâm", 22, "16T3");
		Student truong = new Student("Trương Trâm", 22, "16T2");
		Card card1 = new Card("1", tram, list1, LocalDate.now(), LocalDate.now());
		Card card2 = new Card("1", truong, list2, LocalDate.of(2020, Month.MAY, 13), LocalDate.of(2020, Month.MAY, 13));
		CardUtils.exportCard(card1,card2);
		

	}

}
