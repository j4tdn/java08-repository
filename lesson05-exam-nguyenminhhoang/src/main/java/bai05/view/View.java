package bai05.view;

import bai05.bean.Customer;
import bai05.bean.Textbook;

public class View {
	private static Customer[] listCustomer = new Customer[2];
	private static Textbook[] listTextBook = new Textbook[2];
	private static Textbook[] listReferenceBook = new Textbook[2];

	public static void main(String[] args) {
		inputCustomer();

	}

	public static void inputCustomer() {
		listCustomer[0] = new Customer();
		listCustomer[0].input();
		listCustomer[1] = new Customer();
		listCustomer[1].input();
		listCustomer[2] = new Customer();
		listCustomer[2].input();

	}
}
