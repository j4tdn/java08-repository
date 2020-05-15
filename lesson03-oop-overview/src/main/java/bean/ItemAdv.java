package bean;

import java.time.LocalDate;

public class ItemAdv {
	private String id;
	private String name;
	private String shortName;
	private String type;
	private String original;
	private double price;
	private LocalDate from;
	private LocalDate to;
	
	private ItemAdv(Builder builder) {
		// TODO Auto-generated constructor stub
		this.id=builder.id;
		this.name=builder.name;
		this.shortName= builder.shortName;
		this.type = builder.type;
		this.original = builder.original;
		this.price = builder.price;
		this.from= builder.from;
		this.to= builder.to;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getShortName() {
		return shortName;
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

	public static Builder builder() {
		return new Builder();
	}
	
	
	
	@Override
	public String toString() {
		return "ItemAdv [id=" + id + ", name=" + name + ", shortName=" + shortName + ", type=" + type + ", original="
				+ original + ", price=" + price + ", from=" + from + ", to=" + to + "]";
	}



	public static class Builder {
		private String id;
		private String name;
		private String shortName;
		private String type;
		private String original;
		private double price;
		private LocalDate from;
		private LocalDate to;
		
		private Builder() {
			// TODO Auto-generated constructor stub
		}

		public Builder setId(String id) {
			this.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setShortName(String shortName) {
			this.shortName = shortName;
			return this;
		}

		public Builder setType(String type) {
			this.type = type;
			return this;
		}

		public Builder setOriginal(String original) {
			this.original = original;
			return this;
		}

		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder setForm(LocalDate from) {
			this.from = from;
			return this;
		}

		public Builder setTo(LocalDate to) {
			this.to = to;
			return this;
		}
		
		public ItemAdv build() {
			return new ItemAdv(this);
		}
	
	}
}
