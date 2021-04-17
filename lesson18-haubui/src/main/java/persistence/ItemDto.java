package persistence;

import java.time.LocalTime;

public class ItemDto {

	public static String ITEM_ID = "itemId";
	public static String ITEM_NAME = "itemName";
	public static String DATE = "date";
	
	private Integer itemId;

	private String itemName;

	private LocalTime date;

	public ItemDto() {
	}

	@Override
	public String toString() {
		return itemId + " | " + itemName + " | " + date;
	}

	
	
}