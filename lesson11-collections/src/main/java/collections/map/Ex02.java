package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Ex02 {
	public static void main(String[] args) {
		//Map<Integer, String> sortedlMap = sort(mockData());
		//printf(sortedlMap);
		
		sortUsingJava8(mockData());
		printf(sortUsingJava8(mockData()));
		
		// sort by property <k,v>
		// b1: convert to Set<entry<k,v>>
		// b2: sort
		// b3: transfers Set<entry<k,v>> back to map

		// b1:

		// b2:
		// entrySet.stream().sorted(Comparator.comparing(Entry::getKey));

	}

	private static Map<Integer, String> sortUsingJava8(Map<Integer, String> modelMap) {
		return modelMap.entrySet().stream()
		.sorted(Entry.comparingByKey(Comparator.reverseOrder()))
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
	}

	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {

		List<Entry<Integer, String>> entryList = new LinkedList<>(modelMap.entrySet());
		entryList.sort(Entry.comparingByValue());
		// b3:
		Map<Integer, String> sortMap = new LinkedHashMap<Integer, String>();
		entryList.forEach(entry -> {
			sortMap.put(entry.getKey(), entry.getValue());
		});
		return sortMap;
	}

	private static void printf(Map<Integer, String> sortedlMap) {

		sortedlMap.entrySet().forEach(entry -> System.out.println(entry));// bieu thuc lam da dai dien cho 1 funtional
																			// interface

	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> modelMap = new TreeMap<>(Comparator.reverseOrder());
		modelMap.put(43, "Da Nang");
		modelMap.put(75, "Hue");
		modelMap.put(92, "Quang Nam");
		modelMap.put(74, "Quang Tri");

		return modelMap;
	}
}
