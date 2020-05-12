package bean;

public class Item {
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", Os=" + Os + ", Price=" + Price + ", Color=" + Color + "]";
	}

	//attributes 
	private String Id ;
	private String Os ;
	private double Price ;
	private String Color ;
	
	//default constructor ;
	public Item() {
	}
	
	// Constructor 
	
	public Item(String id , String os  , String color,double price ) {
		this.Id = id ;
		this.Os = os ;
		this.Price = price ;
		this.Color = color ;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getOs() {
		return Os;
	}

	public void setOs(String os) {
		Os = os;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	
	
}
