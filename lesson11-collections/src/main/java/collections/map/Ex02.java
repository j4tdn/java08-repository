package collections.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ex02 {

	public static void main(String[] args) {
		Map<Integer, String> sortedMap = sortUsingJava8(mockData());
		printf(sortedMap);		
	}
	
	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println(entry));
	}
	
	private static Map<Integer, String> sortUsingJava8(Map<Integer, String> modelMap) {
		// Constructor reference
		// Supplier = () -> A
		// Supplier = A::new
	
		return modelMap.entrySet().stream()
			.sorted(Entry.comparingByKey())
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {
		// B1: Convert to Set<Entry<K, V>>	
		// B2: Convert to List<Entry<K, V>>	
		// B3: Sort		
		List<Entry<Integer, String>> sortedList = new LinkedList<>(modelMap.entrySet());
		sortedList.sort(Entry.comparingByKey());
		
		// B4: Transfers Set<Entry<K, V>> back to Map
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		sortedList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});		
		return sortedMap;
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> modelMap = new TreeMap<>(Comparator.reverseOrder());
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(92, "Quảng Nam");
		modelMap.put(75, "Thừa Thiên Huế");
		modelMap.put(74, "Quảng Trị");
		modelMap.put(73, "Quảng Bình");
		return modelMap;
	}
}
