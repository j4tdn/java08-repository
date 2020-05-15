package view;

import java.time.LocalDate;

import bean.ItemAdv.Builder;
import bean.ItemAdv;
import bean.ItemDetail;

public class ItemView {
	public static void main(String[] args) {
		// full parameters
		ItemDetail item1 = 
				new ItemDetail("c", "d", "e", "a", "b",  1, LocalDate.now(), LocalDate.now().plusDays(2));
		
		ItemDetail item2 = 
				new ItemDetail("c", "d", "e", "a", "b",  1, null, null);
		
		ItemDetail item3 = 
				new ItemDetail(null, "d", "e", "a", "b",  1, null, null);
		
		ItemAdv.Builder builder = ItemAdv.builder()
				.id("X-02")
				.shortName("X02")
				.original("Vietnam");
		
		ItemAdv item4 = builder.build();
		
		ItemAdv item5 = builder.name("Hello")
				.build();
		
		System.out.println(item4);
		
	}
}
