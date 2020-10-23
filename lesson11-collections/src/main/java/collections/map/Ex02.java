package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * Map<Integer, String> sortedMap = sort(mockData()); printf(sortedMap);
		 */
		printf(sortUsingJava08(mockData()));
		
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> modelMap = new TreeMap<>(Comparator.reverseOrder());
		modelMap.put(43, "Da Nang");
		modelMap.put(92, "Quang Nam");
		modelMap.put(75, "Hue");
		modelMap.put(74, "Quang Tri");
		modelMap.put(73, "Quang Binh");
		return modelMap;
	}

	private static Map<Integer, String> sortUsingJava08(Map<Integer,String> modelMap){
		return modelMap.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey,Entry:: getValue,(e1,e2)->e2,LinkedHashMap::new));
	}

	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {
		// sort by property<K,V>
		// B1: convert to Set<entry<K, V>
		// B1: convert to List<entry<K, V>
		// B2: sort List
		List<Entry<Integer, String>> sortedList = new LinkedList<>(modelMap.entrySet());
		sortedList.sort(Entry.comparingByValue());

		// B3: Transfers List<entry<K,V> back to MAP
		Map<Integer, String> sortdMap = new LinkedHashMap<>();
		sortedList.forEach(entry -> {
			sortdMap.put(entry.getKey(), entry.getValue());
		});

		return sortdMap;

	}

	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println(entry));// lamda dai dien cho functional interface

	}
}
