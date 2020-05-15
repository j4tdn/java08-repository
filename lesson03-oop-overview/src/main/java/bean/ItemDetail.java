package bean;

import java.time.LocalDate;

// ko dung nua
public class ItemDetail {
	private String id;
	private String shortName;
	private String name;
	private String type;
	private String original;
	private double price;
	private LocalDate from;
	private LocalDate to;
	
	public ItemDetail() {
	}

	public ItemDetail(String id, String shortName, String name, String type, String original, double price,
			LocalDate from, LocalDate to) {
		super();
		this.id = id;
		this.shortName = shortName;
		this.name = name;
		this.type = type;
		this.original = original;
		this.price = price;
		this.from = from;
		this.to = to;
	}
	
}
