package utils;

import bean.Book;
import bean.Card;

public class CardUtils {
	public static void showCard(Card... cards) {
		for (Card card : cards) {
			System.out.println("=====================Information Card==============");
			System.out.println("Mã mượn: " + card.getId());
			System.out.println("Ngày mượn: " + card.getStartDate());
			System.out.println("Ngày trả: " + card.getExpireDate());
			System.out.println("Sách sược mượn: ");
			for (Book book : card.getBooks()) {
				System.out.println(book);
			}
			System.out.println(card.getStudent());
			System.out.println("==================================================");
			System.out.println();
		}
	}
}
