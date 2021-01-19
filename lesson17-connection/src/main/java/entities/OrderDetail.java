package entities;

public class OrderDetail {
	private Items item;
	private Order order;
	private Integer amount;

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderDetail [item=" + item + ", order=" + order + ", amount=" + amount + "]";
	}

}
