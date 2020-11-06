package collections.map;

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
		Map<Integer, String> modelMap = sortUsingJava08(mockData());
		printf(modelMap);
		//modelMap.entrySet().forEach(entry -> System.out.println(entry));
		
		

	}
	
	private static Map<Integer, String> mockData(){
		Map<Integer, String> modelMap = new TreeMap<>(Comparator.reverseOrder());
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(74, "Quảng Trị");
		modelMap.put(73, "Quảng Bình");
		modelMap.put(75, "Huế");
		modelMap.put(92, "Quảng Nam");
		return modelMap;
	}
	
	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println(entry));
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> modelMap){
		//sort by property <K,V>
		
		//b1: convert to Set<Entry<K,V>>
		//b2: convert to List<Entry<K,V>>
		//b3: sort
		List<Entry<Integer, String>> entryList = new LinkedList<>(modelMap.entrySet());
		entryList.sort(Entry.comparingByValue());
		
		//b4: transfers List<Entry<K,V>> back to Map
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		entryList.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});
		return sortedMap;
	}
	
	private static Map<Integer, String> sortUsingJava08(Map<Integer, String> modelMap) {
		return modelMap.entrySet().stream()
				.sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
	}

}
