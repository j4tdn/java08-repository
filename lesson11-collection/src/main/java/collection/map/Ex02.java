package collection.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ex02 {

	public static void main(String[] args) {
		Map<Integer, String> modelMap = sort(mockData());

//		prinft(modelMap);
//		sortUsingJava8(mockData());
		prinft(sortUsingJava8(mockData()));
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> modelMap = new TreeMap<Integer, String>(Comparator.reverseOrder());

		modelMap.put(43, "Da Nang");
		modelMap.put(92, "Quang Nam");
		modelMap.put(75, "Thua Thien Hue");
		modelMap.put(74, "Quang Tri");
		modelMap.put(73, "Quang Binh");

		return modelMap;
	}

	private static void prinft(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println("Entry: " + entry));
	}

	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {
//		modelMap.entrySet().forEach(entry -> System.out.println("Entry: " + entry));

		// sort by property <K,V>
		// B1 : Convert to Set<Entry<K,V>>
		// B2 : Sort

//		Set<Entry<Integer, String>> entrySet = modelMap.entrySet();

		List<Entry<Integer, String>> sortList = new LinkedList<>(modelMap.entrySet());
		sortList.sort(Entry.comparingByValue());

		// B3 : Transfers Set<Entry<K,V>> back to Map
		Map<Integer, String> sortMap = new LinkedHashMap<Integer, String>();

		sortList.forEach(entry -> sortMap.put(entry.getKey(), entry.getValue()));
		return sortMap;

	}

	private static Map<Integer, String> sortUsingJava8(Map<Integer, String> modelMap) {
		return modelMap.entrySet().stream().sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

	}
}
