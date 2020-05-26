package ex05;

public class View {
	public static void main(String[] args) {
		Textbook textbook01 = new Textbook("SGK01", 120, "Nhi Dong", true);
		Textbook textbook02 = new Textbook("SGK02", 40, "Tran Quan Lam2", true);
		Textbook textbook03 = new Textbook("SGK03", 250, "Tran Quan Lam3", true);

		Textbook referenceBooks01 = new ReferenceBooks("STK01", 200, "Tran Thanh An01", true, 10);
		Textbook referenceBooks02 = new ReferenceBooks("STK02", 40, "Nhi Dong", true, 20);

		Textbook[] textbooks = { textbook01, textbook02, textbook03, referenceBooks01, referenceBooks02 };
		for (int i = 0; i < textbooks.length; i++) {
			System.out.println(textbooks[i]);
		}

		System.out.println("===================================================================");
		System.out.println("Find publicer Nhi Dong: ");
		for (int i = 0; i < textbooks.length; i++) {
			if (textbooks[i].getPublisher().equals("Nhi Dong")) {
				System.out.println(textbooks[i]);
			}
		}

		System.out.println("===================================================================");
		System.out.println("Find bookPrice < 50: ");
		for (int i = 0; i < textbooks.length; i++) {
			if (textbooks[i].getPriceTextBook() < 50) {
				System.out.println(textbooks[i]);
			}
		}

		System.out.println("===================================================================");
		System.out.println("Find bookPrice form 100 to 200: ");
		for (int i = 0; i < textbooks.length; i++) {
			if (textbooks[i].getPriceTextBook() > 100 && textbooks[i].getPriceTextBook() < 200) {
				System.out.println(textbooks[i]);
			}
		}

		Textbook[] textbookBuy = { textbook01, referenceBooks01 };
		Customer customer = new Customer(1, "Tran Quan Lam", "0122123123", "DaNang", textbookBuy);
	}
}
