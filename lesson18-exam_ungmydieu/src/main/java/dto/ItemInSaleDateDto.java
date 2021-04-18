package dto;

import java.time.LocalTime;

public class ItemInSaleDateDto {
	
	public static String ITEM_ID = "id";
	public static String ITEM_Name = "name";
	public static String ORDER_TIME = "orderTime";

	private Integer id;
	private String name;
	private LocalTime orderTime;
	
	public ItemInSaleDateDto() {
	}

	public ItemInSaleDateDto(Integer id, String name, LocalTime orderTime) {
		super();
		this.id = id;
		this.name = name;
		this.orderTime = orderTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}
	
	@Override
	public String toString() {
		return "OrderItem: [id: " + id + " - name: " + name + " - orderTime: " + orderTime + "]";
	}
}
