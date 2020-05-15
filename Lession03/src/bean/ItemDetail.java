package bean;

import java.time.LocalDate;

public class ItemDetail {
	private String id;
	private String shortname;
	private String name;
	private String type;
	private String oroginal;
	private double price;
	private LocalDate from;
	private LocalDate to;

	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}
	public ItemDetail(String shortname, String name, String type, String oroginal, double price,
			LocalDate from, LocalDate to) {
		super();
		this.shortname = shortname;
		this.name = name;
		this.type = type;
		this.oroginal = oroginal;
		this.price = price;
		this.from = from;
		this.to = to;
	}
	public ItemDetail(String id, String shortname, String name, String type, String oroginal, double price) {
		super();
		this.id = id;
		this.shortname = shortname;
		this.name = name;
		this.type = type;
		this.oroginal = oroginal;
		this.price = price;
	}

	public ItemDetail(String id, String shortname, String name, String type, String oroginal, double price,
			LocalDate from, LocalDate to) {
		super();
		this.id = id;
		this.shortname = shortname;
		this.name = name;
		this.type = type;
		this.oroginal = oroginal;
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

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
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

	public String getOroginal() {
		return oroginal;
	}

	public void setOroginal(String oroginal) {
		this.oroginal = oroginal;
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
