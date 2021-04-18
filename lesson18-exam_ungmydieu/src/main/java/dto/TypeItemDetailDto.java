package dto;

public class TypeItemDetailDto {
	public static String TYPE_ID ="typeId";
	public static String TYPE_NAME ="typeName";
	public static String ITEM_ID ="itemId";
	public static String ITEM_NAME ="itemName";
	public static String SALE_PRICE ="salePrice";
	public static String PURCHASE_PRICE ="purchasePrice";
	public static String QUANTITY ="quantity";
	
	private Integer typeId;
	private String typeName;
	private Integer itemId;
	private String itemName;
	private Double salePrice;
	private Double purchasePrice;
	private Integer quantity;
	
	public TypeItemDetailDto() {
	}

	public TypeItemDetailDto(Integer typeId, String typeName, Integer itemId, String itemName, Double salePrice,
			Double purchasePrice, Integer quantity) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.salePrice = salePrice;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}	

	public static String getTYPE_ID() {
		return TYPE_ID;
	}

	public static void setTYPE_ID(String tYPE_ID) {
		TYPE_ID = tYPE_ID;
	}

	public static String getTYPE_NAME() {
		return TYPE_NAME;
	}

	public static void setTYPE_NAME(String tYPE_NAME) {
		TYPE_NAME = tYPE_NAME;
	}

	public static String getITEM_ID() {
		return ITEM_ID;
	}

	public static void setITEM_ID(String iTEM_ID) {
		ITEM_ID = iTEM_ID;
	}

	public static String getITEM_NAME() {
		return ITEM_NAME;
	}

	public static void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}

	public static String getSALE_PRICE() {
		return SALE_PRICE;
	}

	public static void setSALE_PRICE(String sALE_PRICE) {
		SALE_PRICE = sALE_PRICE;
	}

	public static String getPURCHASE_PRICE() {
		return PURCHASE_PRICE;
	}

	public static void setPURCHASE_PRICE(String pURCHASE_PRICE) {
		PURCHASE_PRICE = pURCHASE_PRICE;
	}

	public static String getQUANTITY() {
		return QUANTITY;
	}

	public static void setQUANTITY(String qUANTITY) {
		QUANTITY = qUANTITY;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "TypeItem: [typeID: " + typeId + ", typeName: " + typeName 
				+ ", itemID: " + itemId + ", salePrice: " + salePrice + ", purchasePrice: " + purchasePrice + ", quantity: " + quantity + "]";
	}
}
