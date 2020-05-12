package java08.lesson03_haubui_test.bean;

public class Book {
	private String id;
	private String name;
	private String company;

	public Book() {
	}

	public Book(String id, String name, String company) {
		this.id = id;
		this.name = name;
		this.company = company;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return  name ;
	}

}
