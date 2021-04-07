package collections.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> sortedMap = sortUsingJava08(mockData());
		printf(sortedMap);
	}

	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println(entry));
	}
	
	private static Map<Integer, String> sortUsingJava08(Map<Integer, String> modelMap) {
		// A a: String:getMethod
		// Function<A, String> =  a -> a.getMethod
		// Function<A, String> =  A::getMethod * method reference
		
		// () -> A => Supplier
		// a -> () => Consumer
		
		// Constructor reference
		// Suppler<A> = () -> A
		// Suppler<A> = A::new
		
		return modelMap.entrySet().stream()
			.sorted(Entry.comparingByKey())
			.collect(Collectors.toMap(
					Entry::getKey, 
					Entry::getValue, 
					(e1, e2) -> e2, 
					LinkedHashMap::new));
	}

	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {
		// sort by property <K, V>
		// B1: Convert to Set<Entry<K, V>
		// B2: Convert to List<Entry<K, V>
		// B3: Sort List
		List<Entry<Integer, String>> sortedList = new LinkedList<>(modelMap.entrySet());
		sortedList.sort(Entry.comparingByValue());
		
		// B4: Transfers List<Entry<K, V>> back to MAP
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		sortedList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});

		return sortedMap;
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> modelMap = new TreeMap<>(Comparator.reverseOrder());
		modelMap.put(43, "Đà nẵng");
		modelMap.put(92, "Quảng Nam");
		modelMap.put(75, "Thừa Thiên Huế");
		modelMap.put(74, "Quảng Trị");
		modelMap.put(73, "Quảng Bình");
		return modelMap;
	}
}
