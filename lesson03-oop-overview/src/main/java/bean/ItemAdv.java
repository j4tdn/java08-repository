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
	
	//private: de ben ngoai ko tao constructor duoc, ko biet cac doi tuong duoc tao ntn
	private ItemAdv(Builder builder) { //vua khoi tao heap, vua gan gia tri cho cac tham so
		super();
		// copy tung thuoc tinh builder vao itemAdv
		this.id = builder.id;
		this.shortName = builder.shortName;
		this.name = builder.name;
		this.type = builder.type;
		this.original = builder.original;
		this.price = builder.price;
		this.from = builder.from;
		this.to = builder.to;
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
	
	// khoi tao 1 doi tuong builder
	public static Builder builder() {
		return new Builder();
	}

	//nested class: class nam trong class
	// ? tuong tu getter setter
	//nhu 1 thuoc tinh, neu de private thi ben ngoai ko dc dung
	public static class Builder {	//dung thang nay de tao roi copy vao ItemAdv
		private String id;
		private String shortName;
		private String name;
		private String type;
		private String original;
		private double price;
		private LocalDate from;
		private LocalDate to;
		
		// chi duoc goi trong pham vi class
		private Builder() {
			
		}
		
		public Builder id(String id) {
			this.id = id; //Builder.id = id
			return this; //return Builder id
		}

		// Build -> set 
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

		//tao 1 doi tuong ItemAdv
		public ItemAdv build() {
			return new ItemAdv(this);
			// <=> ItemAdv item = new ItemAdv()
		}
	}
	
	public String toString() {
		return " id: " + id + " name: " + name + " origianl: " + original;
	}
}
