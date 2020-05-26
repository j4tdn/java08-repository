package oop;

public class BillUtils {
	private BillUtils() {
		// TODO Auto-generated constructor stub
	}

	public static double getTotalOfBill(Book[] books) {
		double price = 0;
		for(Book book:books) {
			if(book instanceof SchoolBook) {
				SchoolBook schoolBook = (SchoolBook) book;
				if(schoolBook.getStatus().equals(BookStatus.OLD)){
					price += schoolBook.getPrice() * 0.7;
				} else {
					price += schoolBook.getPrice();
				}
			}
			
			if(book instanceof ReferenceBook) {
				ReferenceBook referenceBook = (ReferenceBook) book;
				price += referenceBook.getPrice() * (1 + referenceBook.getTax());
			}
		}
		
		return price;
	}
}
