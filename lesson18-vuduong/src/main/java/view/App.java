package view;

import java.time.LocalDate;

import service.ItemService;
import service.TypeItemService;
import utils.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println(HibernateUtil.getSessionFactory());

		ItemService itemService = new ItemService();
		TypeItemService typeItemService = new TypeItemService();
		
		// Ex1
//		LocalDate date = LocalDate.of(2020, 12, 18);
//		
//		var items = itemService.getItemInSaleDate(date);
//		items.forEach(System.out::println);

		//Ex 2
//		var typeItems = typeItemService.getAllWithNumberItems();
//		typeItems.forEach(System.out::println);
		
		
		// Ex3
		
		var items = itemService.getNameItemBestSellerInYear(2020);
		items.forEach(System.out::println);
		
//		var items = itemService.getAll();
//		items.forEach(System.out::println);

		

	}
}
