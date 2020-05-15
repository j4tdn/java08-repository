package view;

import bean.ItemAdv;
import bean.ItemAdv.Builder;

public class ItemView {
	public static void main(String[] args) {
		//full paraneters
	ItemAdv.Builder builder = ItemAdv.builder()
			.id("X-02")
			.shortName("02")
			.original("VietNam");
	ItemAdv item4 = builder
			.build();
	System.out.println(item4);
	}
}
