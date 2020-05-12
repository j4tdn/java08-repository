package view;

import java.time.LocalDate;
import java.time.Month;

import bean.book;
import bean.card;
import bean.student;

public class hethong {
	student van = new student("Van", 10, "5a");
	student yen = new student("yen", 11, "5b");
	book toan = new book(1, "toan", "NXB hanoi");
	book van = new book(1, "van", "NXB HCM");
	book anh = new book(1, "anh", "NXB hanoi");
	
	
	book[] b1 = {toan, van, anh};
	
	
	card t = new card("123T", "van", yen, LocalDate.of(2020, Month.NOVEMBER, 04) ,LocalDate.of(2020, Month.NOVEMBER, 15));
}