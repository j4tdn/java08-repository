package java08.ungmydieu.lesson05_exam.Ex05.beans;

public class TextBook extends Book{
	private boolean status; // 1: moi, 0: cu
	
	public TextBook() {}

	public TextBook(String id, double price, String company, boolean status) {
		super(id, price, company);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
}
