package bean;

public class ItemDetail {
	
	public static void main(String[] args) {
		ItemAdv.Builder builder = ItemAdv.builder()
				.id("12")
				.shortName("fff");
		ItemAdv item1 = builder.build();
		ItemAdv item2 = builder.name("").build();
		System.out.println(item1.getId());
	}
	
	
}
