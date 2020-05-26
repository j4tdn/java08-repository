package oop;

import java.util.ArrayList;
import java.util.List;

public class View {
	public static void main(String[] args) {
		Book[] data = BookUtils.mockData();

		List<Book> publisherBook = BookUtils.findAllBooksFromPublisher(data, "NXB Nhi Dong");
		publisherBook.forEach(System.out::println);

		System.out.println("=================================");

		List<Book> bookPriceLess50 = BookUtils.findAllBooksHavePriceLess50(data);
		bookPriceLess50.forEach(System.out::println);

		System.out.println("=================================");

		List<SchoolBook> bookPriceFrom100to200 = BookUtils.findAllSchoolBooksHavePriceFrom100To200(data);
		bookPriceFrom100to200.forEach(System.out::println);

		System.out.println("=================================");

		Customer customer = new Customer("id1", "vu", "01234", "VIetnam");
		Book bookMath = new SchoolBook("SGK1", 200, BookStatus.NEW, "NXB Nhi Dong");
		Book referenceGeo = new ReferenceBook("STK1", 300, "NXB Nhi Dong", 0.3);
		Book[] bookOfCustomer = { bookMath, referenceGeo };

		Bill bill = new Bill("b1", customer, bookOfCustomer);
		System.out.println(BillUtils.getTotalOfBill(bill.getBooks()));

	}

}
