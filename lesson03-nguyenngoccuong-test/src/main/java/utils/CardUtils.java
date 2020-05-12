package utils;

import bean.Card;
import bean.Book;

public class CardUtils {
	
	private CardUtils() {
	}
	
	public static void showCard(Card card) {
		System.out.println("============================");
		System.out.println("Mã phiếu mượn: " + card.getId());
		System.out.println("Ngày mượn: " + card.getStartDate());
		System.out.println("Hạn trả: " + card.getEndDate());
		System.out.println("Sách đang mượn: ");
		Book[] books = card.getBooks();
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("Tên sinh viên: " + card.getStudent().getName());
		System.out.println("Tuổi: " + card.getStudent().getAge());
		System.out.println("Lớp: " + card.getStudent().getClassName());
		System.out.println("============================");
	}
	
	public static void showCard(Card... cards) {
		if (cards.length == 0) {
			System.out.println("No card exists!!!");
			return;
		}
		for (Card card : cards) {
			showCard(card);
		}	
	}
}
