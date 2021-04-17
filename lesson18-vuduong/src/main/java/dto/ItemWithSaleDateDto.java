package dto;

import java.time.LocalDate;

public class ItemWithSaleDateDto {
	public static String ITEM_ID = "itemId";
	public static String ITEM_NAME = "itemName";
	public static String SALE_DATE = "saleDate";

	private Integer itemId;
	private String itemName;
	private LocalDate saleDate;

	public ItemWithSaleDateDto() {
	}

	
	public ItemWithSaleDateDto(Integer itemId, String itemName, LocalDate saleDate) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.saleDate = saleDate;
	}
	
	


	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public LocalDate getSaleDate() {
		return saleDate;
	}


	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}


	@Override
	public String toString() {
		return "itemId=" + itemId + ", itemName=" + itemName + ", saleDate=" + saleDate;
	}

}
