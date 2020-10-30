package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		// A a: String: getMethod
		// Function(A, String): a -> getMethod()
		// Function(A, String): A::getMethod

		
		// Constructor reference
		// Suppler<A> = () -> A
		// Suppler<A> = A::new

		Map<Integer, String> modelMap = mockData();
		printf(modelMap);
		System.out.println("=====================================");
		modelMap = sort(modelMap);

		printf(modelMap);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {
		// sort by property <K,V>
		// B1: convert to List<Entry<K,V>>
		// B2: sort
		// B3: transfer List<Entry<K,V>> back to Ma<K,V>
		
		List<Entry<Integer, String>> sortedList = new LinkedList<Map.Entry<Integer,String>>();
		sortedList.sort(Entry.comparingByValue());
		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		sortedList.forEach(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		return sortedMap;
	}

	private static Map<Integer, String> sortJava8(Map<Integer, String> modelMap) {
		
	
		return modelMap.entrySet().stream().sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


	}

	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(x -> System.out.println(x));
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> modelMap = new HashMap<Integer, String>();

		modelMap.put(73, "Quang Binh");
		modelMap.put(74, "Quang Tri");
		modelMap.put(75, "Hue");
		modelMap.put(43, "Da Nang");
		modelMap.put(92, "Quang Nam");
		return modelMap;
	}
}
