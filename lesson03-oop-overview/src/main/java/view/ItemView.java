package view;

import java.time.LocalDate;
import java.time.Month;

import bean.ItemAdv;
import bean.ItemAdv.Builder;

public class ItemView {
	public static void main(String[] args) {
		
		//Ojbect Builder
		Builder builder= ItemAdv.builder();
		ItemAdv item1= builder.setId("jv1").build();
		System.out.println(item1.getId());
		
		ItemAdv item2= builder.setId("jv1").setName("Tu Lanh").build();
		System.out.println(item2.getId()+ item2.getName());
		
		ItemAdv item3= builder.setId("jv1").setName("Tu Lanh").setPrice(1256).build();
		System.out.println(item3.getId()+ item3.getName()+item3.getPrice());
		
		ItemAdv item4= builder.setId("jv1").setName("Tu Lanh").setPrice(1256).build();
		System.out.println(item4.getId()+ item4.getName()+item4.getPrice());
		
		ItemAdv item5= builder.setId("jv1").setName("Tu Lanh").setPrice(1256).setOriginal("Made in VietNam").setForm(LocalDate.of(2020, Month.MAY, 4)).build();
		System.out.println(item5.toString());
	}
}
