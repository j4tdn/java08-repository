package Utils;


import bean.Book;
import bean.Card;



public class CardUtils {
	private CardUtils() {
		
		
	}
	public static void export(Card card) {
		System.out.println("====================");
		System.out.println("Họ tên: " + card.getSvien().getHoten());
		System.out.println("Danh sách Sach Muon");
		Book[]	books = card.getSach();

		for (int i = 0;i< books.length;i++) {
			int s = i+1;
			System.out.print("Sach "+ s +": ");
			System.out.println(books[i].getTenSach());
			
		}

	}
	public static void export(Card ...cards) {
		if (cards.length==0) {
			System.out.println("Khong muon Sach");
			return;
		}
		
		
		for (Card card:cards) {
			export(card);
		}
	}
}
