package view;

import java.time.LocalDate;

import bean.ItemAdv;
import bean.ItemAdv.Builder;

public class ItemView {
	public static void main(String[] args) {
		ItemAdv itemAdv = ItemAdv.builder()
				.id("X-03")
				.shortName("X03")
				.original("QuangNam")
				.build();				
		System.out.println(itemAdv);
		
		ItemAdv.Builder builder = ItemAdv.builder()
				.id("56")
				.shortName("name")
				.original("VietNam");
		
		ItemAdv item2 = builder.name("item2").build();
		ItemAdv item3 = builder.name("item3").from(LocalDate.now()).build();
 		
		System.out.println(item2);
		System.out.println(item3);
	}
}