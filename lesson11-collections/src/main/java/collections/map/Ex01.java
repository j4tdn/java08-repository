package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	
	//Luu toan bo bien so xe-Tinh/TP
	
	public static void main(String[] args) {
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(43, "Da Nang");
		modelMap.put(92, "QN");
		modelMap.put(75, "Hue");
		modelMap.put(73, "QB");
		modelMap.put(74, "QT");
		
		String removed = modelMap.remove(75);
		System.out.println("Removed value: " + removed);
		
		System.out.println("size: " + modelMap.size());
		printf(modelMap);
		
		//tim thanh pho co ma = 43
		String f1 = modelMap.get(43);
		String f2 = modelMap.getOrDefault(99, "Viet Nam");
		
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
	}
	
	private static void printf(Map<Integer, String> modelMap) {
		
		//loop key
		Set<Integer> keys = modelMap.keySet();
		
		//loop value
		Collection<String> values = modelMap.values();
		
		//loop entry
		Set<Entry<Integer, String>> entrySet = modelMap.entrySet();
		
		for (Entry<Integer, String> entry: entrySet) {
			System.out.println("Entry: " + entry);
			System.out.println("Key: " + entry.getValue());
			System.out.println("Value: " + entry.getValue());
		}
	}
}
