package dto;

public class TypeItemWithNumberItemDto {
	private Integer id;

	private String name;

	private Integer numberItems;

	public TypeItemWithNumberItemDto() {
		// TODO Auto-generated constructor stub
	}

	public TypeItemWithNumberItemDto(Integer id, String name, Integer numberItems) {
		super();
		this.id = id;
		this.name = name;
		this.numberItems = numberItems;
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

	public Integer getNumberItems() {
		return numberItems;
	}

	public void setNumberItems(Integer numberItems) {
		this.numberItems = numberItems;
	}

	@Override
	public String toString() {
		return "TypeItemWithNumberItemDto [id=" + id + ", name=" + name + ", numberItems=" + numberItems + "]";
	}

	}
