package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	// Bien so xe - Tinh/Thanh pho
	public static void main(String[] args) {
		Map<Integer, String> modelMap = new HashMap<Integer, String>();
		
		modelMap.put(73, "Quang Binh");
		modelMap.put(74, "Quang Tri");
		modelMap.put(75, "Hue");
		modelMap.put(43, "Da Nang");
		modelMap.put(92, "Quang Nam");

		String removed = modelMap.remove(75);
		System.out.println("removed value: " + removed);
		
		System.out.println("size: " + modelMap.size());
		
		printf(modelMap);
		
		// Tim thay pho ma ma = 45
		String f1 = modelMap.get(43);
		String f2 = modelMap.getOrDefault(99, "Viet Nam");
		
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
	}
	
	private static void printf(Map<Integer, String> modelMap) {
		// loop key
		Set<Integer> keys = modelMap.keySet();
		
		// loop value
		Collection<String> values = modelMap.values();
		
		// loop entry
		Set<Entry<Integer, String>> entrySet = modelMap.entrySet();
		
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println("Entry: "  + entry);
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());

		}
		
		
		
	}
}
