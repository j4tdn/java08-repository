package dto;

public class TypeItemDto {
	public static String TYPE_ITEM_ID ="id";
	public static String TYPE_ITEM_NAME ="name";
	public static String TYPE_ITEM_QUANTITY ="quantity";
	
	private Integer id;
	private String name;
	private Integer quantity;
	
	public TypeItemDto() {
	}

	public TypeItemDto(Integer id, String name, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public static String getTYPE_ITEM_ID() {
		return TYPE_ITEM_ID;
	}

	public static void setTYPE_ITEM_ID(String tYPE_ITEM_ID) {
		TYPE_ITEM_ID = tYPE_ITEM_ID;
	}

	public static String getTYPE_ITEM_NAME() {
		return TYPE_ITEM_NAME;
	}

	public static void setTYPE_ITEM_NAME(String tYPE_ITEM_NAME) {
		TYPE_ITEM_NAME = tYPE_ITEM_NAME;
	}

	public static String getTYPE_ITEM_QUANTITY() {
		return TYPE_ITEM_QUANTITY;
	}

	public static void setTYPE_ITEM_QUANTITY(String tYPE_ITEM_QUANTITY) {
		TYPE_ITEM_QUANTITY = tYPE_ITEM_QUANTITY;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "TypeItem: [id: " + id + " - name: " + name + " - quantity: " + quantity + "]";
	}
}
