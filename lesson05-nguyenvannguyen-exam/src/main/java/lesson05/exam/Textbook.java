package lesson05.exam;

public class Textbook extends Book{
	
	private String status;
	
	public Textbook() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param price
	 * @param author
	 * @param status
	 */
	public Textbook(String id, int price, String author, String status) {
		super(id, price, author);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	

	public void setStatus(String status) {
		this.status = status;
	}
	
	


}
