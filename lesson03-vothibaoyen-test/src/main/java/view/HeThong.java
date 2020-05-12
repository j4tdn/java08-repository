package view;

import java.time.LocalDate;
import java.time.Month;


import bean.Book;
import bean.Card;

import bean.Student;



public class HeThong {

	public static void main(String[] args) {
		Book AnhVan=new Book("1","AnhVan","NXB Ho Chi Minh");
		Book Toan=new Book("2","TinHoc","NXB Ho Chi Minh");
		Book TiengViet=new Book("3","Tiengviet","NXB Ho Chi Minh");
		
		Student andy=new Student("1","andy","9","3b");
		Student lina=new Student("2","lina","9","3b");
		
		Book[] firstbooks= {AnhVan,Toan,TiengViet};
		Book[] secondbooks= {Toan,TiengViet};
		Book[] thirdbooks= {TiengViet,AnhVan};

     
		Card firstacard=new Card("1", LocalDate.of(2020, Month.MAY, 03),LocalDate.of(2020, Month.MAY, 07),andy,firstbooks);
		Card.export(firstacard);
	}

}
