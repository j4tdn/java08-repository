package entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {


	public static String ID = "id";
	public static String NAME = "name";
	public static  String SALES_OUT = "salesOUt";
	public static String QUATITY = "quatity";





	private Integer id;

	private String name;

	private String size;


	private Double buyPrice;

	private Double sellPrice;

	private Integer qty;

	private String color;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return Objects.equals(id, item.id) &&
				Objects.equals(name, item.name) &&
				Objects.equals(size, item.size) &&
				Objects.equals(buyPrice, item.buyPrice) &&
				Objects.equals(sellPrice, item.sellPrice) &&
				Objects.equals(qty, item.qty) &&
				Objects.equals(color, item.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, size, buyPrice, sellPrice, qty, color);
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", name='" + name + '\'' +

				", buyPrice=" + buyPrice +

				", qty=" + qty +

				'}';
	}
}
