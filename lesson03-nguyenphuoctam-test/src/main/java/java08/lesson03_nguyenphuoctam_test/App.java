package java08.lesson03_nguyenphuoctam_test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	private static final Scanner scanner=new Scanner(System.in);
	private static final Student st1 = new Student("st01", "Nguyen Van A", 18, "12A");
	private static final Student st2 = new Student("st02", "Nguyen Van B", 17, "11C");
	private static final Student st3 = new Student("st03", "Nguyen Van C", 18, "12B");
	private static final Book book1 = new Book("b01", "Java", "company A");
	private static final Book book2 = new Book("b02", "C++", "company B");
	private static final Book book3 = new Book("b03", "JavaScript", "company C");
	private static final List<Student> students =Arrays.asList(st1,st2,st3);
	private static final List<Book> books =Arrays.asList(book1,book2,book3);
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		
		
		
		System.out.println("borrow book");
		
	}
	
	private static Card borrowBook() {
		String nameStudent = "";
		String nameBook = "";
		System.out.println("Input name Student : ");
		nameStudent = scanner.nextLine();
		System.out.println("Input name Book : ");
		nameBook = scanner.nextLine();
		
		return new Card("s", LocalDate.of(2020, Month.MAY, 12), LocalDate.of(2020, Month.MAY, 12), showIdBook(nameBook), showIdStdent(nameStudent));
	}
	
	private static String showIdStdent(String name) {
		for (Student student : students) {
			if(student.getIdStudent().equals(name)) {
				return student.getIdStudent();
			};
		}
		return "";
	}
	
	private static String showIdBook(String name) {
		for (Book book : books) {
			if(book.getIdBook().equals(name)) {
				return book.getIdBook();
			};
		}
		return "";
	}
}
