package collections.map;

import java.util.Collection;
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

import javax.sound.sampled.ReverbType;

public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> sortedMap = sortUsingJava08(mockData());
		
		printf(sortedMap);
	}
	
	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println(entry)); //lamda: dai dien functional interface
		
	}
	
	private static Map<Integer, String> mockData() {
		//Map<Integer, String> modelMap = new TreeMap<>();
		Map<Integer, String> modelMap = new TreeMap<>(Comparator.reverseOrder());
		modelMap.put(43, "Da Nang");
		modelMap.put(92, "QN");
		modelMap.put(75, "Hue");
		modelMap.put(73, "QB");
		modelMap.put(74, "QT");
		
		return modelMap;
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> modelMap){
		// sort by property <K,V>
		// B1: Convert to Set<Entry<K,V>>
		// B2: Convert to List<Entry<K,V>>
		// B3: Sort List
		
		List<Entry<Integer, String>> sortedList = new LinkedList<>(modelMap.entrySet());
		//sortedList.sort(Entry.comparingByKey());
		sortedList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
														
		// B3: Transfers Set<Entry<K,V> back to Map
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		sortedList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});
		
		return sortedMap;
	}
	
	private static Map<Integer, String> sortUsingJava08(Map<Integer, String> modelMap){
		return modelMap.entrySet().stream()
				.sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(
						Entry::getKey,
						Entry::getValue,
						(e1, e2) -> e2,
						LinkedHashMap::new
				));
	}
}
