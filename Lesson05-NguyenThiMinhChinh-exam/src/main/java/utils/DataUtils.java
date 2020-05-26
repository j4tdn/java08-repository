package utils;
import bean.Book;

public class DataUtils {
	public static void Find(Book...books) {
		String publisher = "Nhi Đồng";
		for(int i = 0 ; i< books.length; i++) {
			if(books[i].getPublisher() == publisher) {
				System.out.println(books[i]);
			}
		}
	}
}
