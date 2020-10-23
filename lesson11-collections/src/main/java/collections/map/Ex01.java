package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(93, "Quảng Nam");
		modelMap.put(75, "Thừa Thiên Huế");
		modelMap.put(74, "Quảng Trị");
		modelMap.put(73, "Quảng Bình");

		String removed = modelMap.remove(75);
		System.out.println("remove value: " + removed);

		System.out.println();
		
		String f1 = modelMap.get(43);
		String f2 = modelMap.getOrDefault(44, "Viet Nam");

		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);

		System.out.println();

		printf(modelMap);
	}

	private static void printf(Map<Integer, String> modelMap) {

		// loop key
		Set<Integer> keys = modelMap.keySet();

		// loop value
		Collection<String> value = modelMap.values();

		// loop entry
		Set<Entry<Integer, String>> entrySet = modelMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Entry: " + entry);
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}

	}
}
