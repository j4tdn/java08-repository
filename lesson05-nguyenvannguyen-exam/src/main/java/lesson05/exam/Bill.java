package lesson05.exam;

import java.util.Arrays;

public class Bill {
	private Customer item;
	private Book[] bookBought;
	private int priceOfBill;
	
	public Bill() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param item
	 * @param bookBought
	 * @param priceOfBill
	 */
	public Bill(Customer item, Book[] bookBought, int priceOfBill) {
		super();
		this.item = item;
		this.bookBought = bookBought;
		this.priceOfBill = priceOfBill;
	}

	public Customer getItem() {
		return item;
	}

	public void setItem(Customer item) {
		this.item = item;
	}

	public Book[] getBookBought() {
		return bookBought;
	}

	public void setBookBought(Book[] bookBought) {
		this.bookBought = bookBought;
	}

	public int getPriceOfBill() {
		return priceOfBill;
	}

	public void setPriceOfBill(int priceOfBill) {
		this.priceOfBill = priceOfBill;
	}

	
	

}
