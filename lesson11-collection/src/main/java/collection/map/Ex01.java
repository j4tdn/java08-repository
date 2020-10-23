package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	// Bien so xe - Tinh/thanh pho
	public static void main(String[] args) {
		Map<Integer, String> modelMap = new HashMap<Integer, String>();

		modelMap.put(43, "Da Nang");
		modelMap.put(92, "Quang Nam");
		modelMap.put(75, "Thua Thien Hue");
		modelMap.put(74, "Quang Tri");
		modelMap.put(73, "Quang Binh");

		String remove = modelMap.remove(75);
		System.out.println("removed value :" + remove);

		System.out.println("size :" + modelMap.size());
		prinft(modelMap);

		// Tim thanh phi ma 43
		String f1 = modelMap.get(43);
		String f2 = modelMap.getOrDefault(75, "Viet Nam");

		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);

	}

	private static void prinft(Map<Integer, String> modelMap) {
		// loop key
		Set<Integer> keys = modelMap.keySet();

		// loop value
		Collection<String> value = modelMap.values();

		// loop key and value
		Set<Entry<Integer, String>> entrySet = modelMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Entry: " + entry);
			System.out.println("Entry Key: " + entry.getKey());
			System.out.println("Entry Value: " + entry.getValue());
		}
	}

}
