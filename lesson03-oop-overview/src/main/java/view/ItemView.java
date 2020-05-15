package view;
import java.time.LocalDate;
import bean.ItemAdv;
import bean.ItemAdv.Builder;
import bean.ItemDetail;

public class ItemView {
	public static void main(String[] args) {
		//full parameter
		// tranh truyen vao nham lan thi co the dung setter
		ItemDetail item1 = 
				new ItemDetail("1", "1", "1", "1", "1", 1, LocalDate.now(), LocalDate.now().plusDays(2));
		
		ItemDetail item2 = 
				new ItemDetail(null, "1", "1", "1", "1", 1, null, null);
		
		ItemAdv item3 = ItemAdv.builder()
				.id("X-02")
				.shortName("X02")
				.original("Vietnam")
				.build(); //dua thuoc tinh vao roi build, tra ve item3 luon
		
		ItemAdv.Builder builder = ItemAdv.builder()
				.id("X-02") //tra ve id Build
				.shortName("X02")
				.original("Vietnam");
		
		ItemAdv item4 = builder
				.build();
		
		ItemAdv item5 = builder.name("Hello")
				.build();
		
//		ItemAdv.Builder item55 = ItemAdv.builder()
//				.id("X-03")
//				.shortName("X02")
//				.original("Vietnam");
//		
		System.out.println(item3);
	}
	
	
}
