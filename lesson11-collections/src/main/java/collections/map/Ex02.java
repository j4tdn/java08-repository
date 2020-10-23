package collections.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> modelMap = mockData();

		Map<Integer, String> sortedMap = sort(modelMap);

		printf(sortedMap);
	}

	private static Map<Integer, String> sortUsingJava08(Map<Integer, String> modelMap) {

		// constructor reference
		// supplier<A> = () -> A
		// supplier<A> = A::new

		return modelMap.entrySet().stream()
								  .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
								  .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
	}

	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {

		List<Entry<Integer, String>> sortedList = new LinkedList<>(modelMap.entrySet());

		sortedList.sort(Entry.comparingByValue());

		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		sortedList.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

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

	private static void printf(Map<Integer, String> modelMap) {

		// loop key
		// Set<Integer> keys = modelMap.keySet();

		// loop value
		// Collection<String> value = modelMap.values();

		// loop entry
		Set<Entry<Integer, String>> entrySet = modelMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("Entry: " + entry);
			// System.out.println("Key: " + entry.getKey());
			// System.out.println("Value: " + entry.getValue());
		}

	}
}
