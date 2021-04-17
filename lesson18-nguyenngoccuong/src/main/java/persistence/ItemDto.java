package persistence;

import java.time.LocalTime;

public class ItemDto {

	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String ORDER_TIME = "orderTime";

	private Integer id;
	private String name;
	private LocalTime orderTime;

	public ItemDto() {
	}

	public ItemDto(Integer id, String name, LocalTime orderTime) {
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

	public LocalTime getLocalTime() {
		return orderTime;
	}

	public void setLocalTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", orderTime=" + orderTime + "]";
	}

}
