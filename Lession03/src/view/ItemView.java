package view;

import java.time.LocalDate;

import bean.ItemAdv;
import bean.ItemAdv.Builder;
import bean.ItemDetail;

public class ItemView {
	public static void main(String[] args) {
		ItemDetail item1 = new ItemDetail("1", "1", "1", "1", "1", 1, LocalDate.now(), LocalDate.now().plusDays(2));
		ItemDetail item2 = new ItemDetail(null, "1", "1", "1", "1", 1, LocalDate.now(), LocalDate.now().plusDays(2));
		
		//ItemAdv item3 = new ItemAdv().builder();
		//ItemAdv item4 = new ItemAdv.
	}
}
