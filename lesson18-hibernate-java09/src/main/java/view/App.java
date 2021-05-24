package view;




import persistence.Item;
import persistence.ItemGroup;
import service.ItemGoupServiceImpl;
import service.ItemServiceImpl;

public class App {
	private static ItemGoupServiceImpl itemGroupService;
	private static ItemServiceImpl itemService;

	static {
		itemGroupService=new ItemGoupServiceImpl();
		itemService=new ItemServiceImpl();
	}

	public static void main(String[] args) {
//		List<ItemGroup> igrList = itemGroupService.getAll();
//		System.out.println("size: " + igrList.size());
//		igrList.forEach(igr -> {
//			System.out.println("igr" + igr.getItems().size());
//		});
//
//		System.out.println("=================");
//
//		List<Item> itemList = itemService.getAll();
//		System.out.println("size: " + itemList.size());
//		itemList.forEach(System.out::println);
//
//		System.out.println("=================");
//		Item item = itemService.get(5);
//		System.out.println("item: " + item);
//		ItemGroup ig = new ItemGroup(1, "Áo");
//		Item item = new Item(12, "Áo", 200.0, 400.0, "Den", "S", 2.0, ig);
//		itemService.save(item);
		
//		
		//itemService.getFirstLevelCache(1);
		//itemService.getFirstLevelCacheInTwoSession(1);
		itemService.getSecondLevelCache(1);
	}
}
