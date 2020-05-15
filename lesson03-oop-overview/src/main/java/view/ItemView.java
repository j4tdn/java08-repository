package view;

import java.time.LocalDate;

import bean.ItemAdv;
import bean.ItemAdv.Builder;

public class ItemView {

	public static void main(String[] args) {
		ItemAdv.Builder build= ItemAdv.builder()
				.Id("95")
             	.Original("China");
				
		ItemAdv item1 = build
				.Name("BJYXSZD")
				.build();
		System.out.println(item1.getName()+"--"+item1.getId()+"--"+item1.getOriginal());
		
	}
	
	
	
	
	
}
