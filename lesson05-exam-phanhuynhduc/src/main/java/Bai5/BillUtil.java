package Bai5;

public class BillUtil {
	public static double calPrice(TextBook textBook , ReferenceBook refBook) {
	
			
		return textBook.getStatus() ? textBook.getPrice() : textBook.getPrice() * 70 /100  + refBook.getPrice() * (1+ refBook.getTax());
	}
}
