package view;

import java.time.LocalDate;

import bean1.ItemAdv;
import bean1.ItemAdv.Builder;
import bean1.ItemDetail;

public class ItemView {
	public static void main(String[] args) {
		ItemDetail item1 = new ItemDetail("1", "1", "1", "1", "1", 1, LocalDate.now(), LocalDate.now().plusDays(2));
		ItemDetail item2 = new ItemDetail(null, "1", "1", "1", "1", 1, LocalDate.now(), LocalDate.now().plusDays(2));
		Builder builder = new Builder().Id("1");
		ItemAdv item3 = new Builder().buil();
		Builder item4 = new ItemAdv.Builder();
	}

}
