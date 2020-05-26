package Ex05;

public class Demo {
	public static void main(String[] args) {
		Book[] books= initData();
		System.out.println("\nList of book' publisher is Kim Dong\n");
		findBookBypublisher("Kim Dong", books);
		System.out.println("\nList of book' price less 50000\n");
		findBookbyPriceless(50000, books);
		System.out.println("\nList of book' price between 10000 and 51000\n");
		findBookbyPriceRank(10000, 51000, books);
	}

	public static Book[] initData() {
		Book sgk1 = new TextBook("Math1", 10000, "Kim Dong", "new");
		Book sgk2 = new TextBook("Math6", 19000, "Tuoi Tre", "old");
		Book sgk3 = new TextBook("Math10", 60000, "Nha Nam", "new");

		Book stk1 = new ReferenceBook("Math1", 51000, "Kim Dong", 0.1);
		Book stk2 = new ReferenceBook("Math1", 53000, "Kim Dong", 10);

		Book[] books = { sgk1, sgk2, sgk3, stk1, stk2 };
		return books;
	}
	
	public static void findBookBypublisher(String namePublisher,Book[] arrBook) {
		for (Book book : arrBook) {
			if(book.getPublisher().equals(namePublisher)) {
				System.out.println(book.toString());
			}
		}
	}
	
	public static void findBookbyPriceless(double prices,Book[] arrBook) {
		for (Book book : arrBook) {
			if(book.getPrice()<prices) {
				System.out.println(book.toString());
			}
		}
	}
	
	public static void findBookbyPriceRank(double lowprices,double highprices,Book[] arrBook) {
		for (Book book : arrBook) {
			if(book.getPrice()<highprices && book.getPrice()>lowprices) {
				System.out.println(book.toString());
			}
		}
	}
	
}
