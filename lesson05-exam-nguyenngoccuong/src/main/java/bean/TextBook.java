package bean;

public class TextBook extends Book {
	private boolean condition;
	
	public TextBook() {
		super();
	}
	
	public TextBook(String id, double price, String publisher, boolean condition) {
		super(id, price, publisher);
		this.condition = condition;	
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	
	public double getPrice() {
		if(condition == false) price *= 0.7;
		return price;		
	}

	@Override
	public String toString() {
		return "TextBook: [id=" + id + ", price=" + price + ", publisher=" + publisher + ", condition=" + condition + "]";
	}
	
	
}
