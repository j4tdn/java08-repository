package java08.ungmydieu.lesson05_exam.Ex05.beans;

public class TextBook extends Book{
	static double DISCOUNT = 0.7;
	private boolean status; // 1: moi, 0: cu
	
	public TextBook() {}

	public TextBook(String id, double price, String company, boolean status) {
		super(id, price, company);
		this.status = status;
	}
	
	@Override
	public double getPrice() {
		System.out.println("textBook price: " + price * DISCOUNT);
		if (status == false) return price * DISCOUNT;
		return super.getPrice();
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
	
	@Override
	public String toString() {		
		return "id: " + id + ", price: " + price + ", company:  " + company + ", status:  " + status;
	}
}
