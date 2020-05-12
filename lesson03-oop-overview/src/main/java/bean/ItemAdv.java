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
		return this.id;
	}


	public String getShortName() {
		return this.shortName;
	}


	public String getName() {
		return this.name;
	}


	public String getType() {
		return this.type;
	}


	public String getOriginal() {
		return this.original;
	}


	public double getPrice() {
		return this.price;
	}


	public LocalDate getFrom() {
		return this.from;
	}


	public LocalDate getTo() {
		return this.to;
	}


	public ItemAdv(Builder builder) {
		
		this.id = builder.id;
		this.shortName = builder.shortName;
		this.name = builder.name;
		this.type = builder.type;
		this.original = builder.original;
		this.price = builder.price;
		this.from = builder.from;
		this.to = builder.to;
	}

	
	public static Builder build() {
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

		public Builder id(String id) {
			this.id  = id;
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
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		public Builder from(LocalDate date) {
			this.from = date ;
			return this;
		}
		public Builder to(LocalDate date) {
			this.to = date;
			return this;
		}
		public ItemAdv build() {
		
					
			return new ItemAdv(this);
		}
		 
		
		
	};
}
