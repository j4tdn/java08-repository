package view;

import java.time.LocalDate;
import java.util.List;

import dto.ItemInSaleDateDto;
import dto.TypeItemDetailDto;
import dto.TypeItemDto;
import persistence.Item;
import service.ItemService;
import service.TypeItemService;

public class Application {	
	
	public static void main(String[] args) {		
		ItemService itemService = new ItemService();
		TypeItemService typeItemService = new TypeItemService();
		
		/* 1. 
		 * 
		 * */		
//		LocalDate lDate = LocalDate.of(2020, 12, 18);
//		List<ItemInSaleDateDto> itemInSaleDate = itemService.getItemInSaleDate(lDate);		
//		itemInSaleDate.forEach(System.out::println);
		
		System.out.println("==============================");
		
		/* 2. 
		 * 
		 * */
//		List<TypeItemDto> typeItemWithQuantity = typeItemService.getTypeItemWithQuantity();		
//		typeItemWithQuantity.forEach(System.out::println);
		
		System.out.println("==============================");
		
		/* 3. 
		 * 
		 * */		
//		List<Item> topItemBestSale = itemService.getTopItemBestSale(2020);		
//		for (Item item : topItemBestSale) {
//			System.out.println("Item: [id: " +item.getId()+ ", name: " +item.getName()+ ", quantity: " + item.getQuantity() +"]");
//		}
		
		System.out.println("==============================");
		
		/* 4. 
		 * 
		 * */	
		List<TypeItemDetailDto> typeItemDetailDto = typeItemService.getTypeItemDetail();		
		typeItemDetailDto.forEach(System.out::println);
	}
}
