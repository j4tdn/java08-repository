package bean;

import java.time.LocalDate;

public class ItemAdv {

	private String id;
	private String shortName;
	private String name;
	private String type;
	private String original;
	private double price;
	private LocalDate from;
	private LocalDate to;
	
	private ItemAdv(Builder builder) {
		this.id=builder.id;
		this.shortName=builder.shortName;
		this.name=builder.shortName;
		this.name=builder.name;
		this.type=builder.type;
		this.original=builder.original;
		this.price=builder.price;
		this.from=builder.from;
		this.to=builder.to;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	public String getId() {
		return id;
	}

	public String getShortName() {
		return shortName;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getOriginal() {
		return original;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}

	
	public static class Builder{
	    private	String id;
		private String shortName;
		private String name;
		private String type;
		private String original;
		private double price;
		private LocalDate from;
		private LocalDate to;
		
		private Builder() {
			
		}

		public Builder Id(String id) {
			this.id = id;
			return this;
		}
		public Builder shortname(String name) {
			this.shortName = name;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder type(String type) {
			this.type = type;
			return this;
		}
		public Builder orginal(String or) {
			this.original = or;
			return this;
		}
		public Builder price(double pr) {
			this.price = pr;
			return this;
		}
		public Builder from(LocalDate date) {
			this.from = date;
			return this;
		}
	
		public Builder to(LocalDate date) {
			this.to = date;
			return this;
		}
		public ItemAdv build() {
			return new ItemAdv(this);
		}
	}
	
}
