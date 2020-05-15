package bean;

import java.time.LocalDate;

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
	
	public ItemDetail(String shortName, String name, String type, String original, double price) {
		this.shortName = shortName;
		this.name = name;
		this.type = type;
		this.original = original;
		this.price = price;
	}
	
	public ItemDetail(String id, String shortName, String name, String type, String original, double price) {
		this.id = id;
		this.shortName = shortName;
		this.name = name;
		this.type = type;
		this.original = original;
		this.price = price;
	}

	public ItemDetail(String id, String shortName, String name, String type, String original, double price,
			LocalDate from, LocalDate to) {
		this.id = id;
		this.shortName = shortName;
		this.name = name;
		this.type = type;
		this.original = original;
		this.price = price;
		this.from = from;
		this.to = to;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}
	
}
