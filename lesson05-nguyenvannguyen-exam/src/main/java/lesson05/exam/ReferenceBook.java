package lesson05.exam;

public class ReferenceBook extends Book {
	
	private int tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}


	


	/**
	 * @param id
	 * @param price
	 * @param author
	 * @param tax
	 */
	public ReferenceBook(String id, int price, String author, int tax) {
		super(id, price, author);
		this.tax = tax;
	}





	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	

}
