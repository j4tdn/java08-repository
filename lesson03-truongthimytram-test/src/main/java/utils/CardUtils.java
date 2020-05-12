package utils;

import bean.Book;
import bean.Card;

public class CardUtils {

	private CardUtils() {
	
     }
	public static void exportCard(Card card) {
		System.out.println("================");
		System.out.println("Họ tên sinh viên: " + card.getStudent().getFullName());
		System.out.println("Lớp: " + card.getStudent().getClassName());
		System.out.println("Danh sách sách mượn: ");
		Book[] books = card.getBooks();
		for (Book book : books) {
			System.out.println("- " + book.getName());
		}
		System.out.println("Ngày mượn: " + card.getFrom());
		System.out.println("Ngày trả: "+ card.getTo());
		
	}
	public static void exportCard(Card ...cards) {
		if(cards.length == 0) {
			System.out.println("no card exist");
			return;	
	}
		for (Card card : cards) {
			exportCard(card);
			
		}
		
	}

}
