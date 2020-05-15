package bean;

import java.time.LocalDate;

public class ItemAdv {
	private String id;
	private String shortname;
	private String name;
	private String type;
	private String original;
	private double price;
	private LocalDate from;
	private LocalDate to;

	public static Builder builder() {
		return new Builder();
	}

	public ItemAdv(Builder builder) {
		super();
		this.id = builder.id;
		this.shortname = builder.shortname;
		this.name = name;
		this.type = type;
		this.original = builder.original;
		this.price = builder.price;
		this.from = builder.from;
		this.to = builder.to;
	}

	public static  class Builder {
		private String id;
		private String shortname;
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

		public Builder Shortname(String shortname) {
			this.shortname = shortname;
			return this;
		}

		public Builder Name(String name) {
			this.name = name;
			return this;
		}

		public Builder Type(String type) {
			this.type = type;
			return this;
		}

		public Builder Original(String original) {
			this.original = original;
			return this;
		}

		public Builder Price(double price) {
			this.price = price;
			return this;
		}

		public Builder From(LocalDate from) {
			this.from = from;
			return this;
		}

		public Builder To(LocalDate to) {
			this.to = to;
			return this;
		}

		public ItemAdv buil() {
			return new ItemAdv(this);
		}
	}
}
