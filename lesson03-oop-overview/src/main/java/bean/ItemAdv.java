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
	
	private ItemAdv(Builder builder) {
		this.id = builder.id;
		this.shortName = builder.shortName;
		this.name = builder.name;
		this.type = builder.type;
		this.original = builder.original;
		this.price = builder.price;
		this.from = builder.from;
		this.to = builder.to;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String id;
		private String shortName;
		private String name;
		private String type;
		private String original;
		private double price;
		private LocalDate from;
		private LocalDate to;
		
		private Builder() {
		}
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		public Builder shortName(String shortName) {
			this.shortName = shortName;
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
		public Builder original(String original) {
			this.original = original;
			return this;

		}
		public Builder price(double price) {
			this.price = price;
			return this;

		}
		public Builder from(LocalDate from) {
			this.from = from;
			return this;

		}
		public Builder to(LocalDate to) {
			this.to = to;
			return this;

		}
		public ItemAdv build() {
			return new ItemAdv(this);
		}
		
	}
}


