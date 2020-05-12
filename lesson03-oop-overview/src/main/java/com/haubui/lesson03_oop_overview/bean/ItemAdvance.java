package com.haubui.lesson03_oop_overview.bean;

import java.time.LocalDate;

public class ItemAdvance {
	private String id;
	private String name;
	private String os;
	private String color;
	private double price;
	private LocalDate from;
	private LocalDate to;

	private ItemAdvance(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.os = builder.os;
		this.color = builder.color;
		this.price = builder.price;
		this.from = builder.from;
		this.to = builder.to;
	}

	public static Builder newInstance() {
		return new Builder();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOs() {
		return os;
	}

	public String getColor() {
		return color;
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

	public static class Builder {
		private String id;
		private String name;
		private String os;
		private String color;
		private double price;
		private LocalDate from;
		private LocalDate to;

		private Builder() {
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder os(String os) {
			this.os = os;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
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

		public ItemAdvance build() {
			return new ItemAdvance(this);
		}

	}
}
