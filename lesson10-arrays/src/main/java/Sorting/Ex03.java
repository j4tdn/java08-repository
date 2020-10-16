package Sorting;

import java.util.Arrays;
import java.util.Comparator;

import Bean.Item;

import static java.util.Comparator.comparing;

public class Ex03 {
	public static void main(String[] args) {
		Item[] item = Ex03.getItem();
		
		// sort bang function cua minh
		//sort(item);
		
		Arrays.sort(item,new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				
				
				// nếu như lớn hơn không thì đổi vị trí, còn nhỏ hơn không hoặc bằng 0 thì không đổi vị trí với nhau
				
				if(o1.getId() == o2.getId()) {
					return (o1.getName().compareTo(o2.getName()));
				}
				
				return o1.getId()- o2.getId();
			}
		});
		
		
		//3,3,4,2,1,2
		
		
		
		
		
		
		
		// short syntax 
//		Arrays.sort(item,comparing(Item::getId).thenComparing(Item::getName));
//		
//		
//		Arrays.stream(item).forEach(it -> {
//			System.out.println(it.toString());
//		});
	
		
//		Arrays.sort(item, (o1,o2) -> {
//			return o1.getId() - o2.getId();
//		});
		
		
		
		
		Arrays.sort(item);
		
		Arrays.stream(item).forEach(el -> System.out.println(el));
		
	}
	
	
//	@SuppressWarnings("rawtypes")
//	public static <E extends Comparable> void sort(E[] e) {
//		// logic o day 
//		
//	}
	
	
	private static Item[] getItem() {
		return new Item[] {
				new Item(1,"A"),
				new Item(2,"Z"),
				new Item(2,"C"),
				new Item(3,"D"),
				new Item(3,"A"),
				new Item(4,"C"),
				
		};
	}
	
	
	
	
	private static void sort(Item[] item) {
		for(int out = item.length - 1 ; out > 0 ; out --) {
			for(int in = 0 ;in < out; in++) {
				
				if(item[in] == null ) {
					continue ;
				}
				
				
				
				
				if(item[out] == null || item[in].getId() > item[out].getId()) {
					Item temp = item[in];
					item[in] = item[out];
					item[out] = temp;
				}
			}
		}
	}
}
