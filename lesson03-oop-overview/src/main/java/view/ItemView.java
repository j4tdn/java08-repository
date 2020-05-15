package view;

import bean.ItemAdv;
import bean.ItemAdv.Builder;

public class ItemView {

	public static void main(String[] args) {
		ItemAdv.Builder builder=ItemAdv.builder().Id("01")
				.shortname("hello")
				.orginal("VN");
		ItemAdv it1=builder.build();
		ItemAdv it2= builder.name("hi").build();
	}

}
