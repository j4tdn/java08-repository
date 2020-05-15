package bean;

public class ItemView {

	public static void main(String[] args) {
		ItemAdv.Builder builder = ItemAdv.builder().id("1").name("1").original("vn");
		ItemAdv item1 = builder.build();
		ItemAdv item2 = builder.price(1).build();

	}

}
