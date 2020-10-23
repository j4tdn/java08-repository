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
		//Map<Integer, String> sortedMap = sort(mockData());
		//printf(sortedMap);
		
		printf(sortUsingJava08(mockData()));
		
	}
	private static void printf(Map<Integer, String> modelMap) {
		modelMap.entrySet().forEach(entry -> System.out.println(entry));//lamda dai dien cho functional interface
		// comparable tu built san
		// muon tu sort dung comparator
		// reverOder
		// sort by property <K, V>
		
		
		
	}
	private static Map<Integer, String> mockData(){
		Map<Integer, String> modelMap =new TreeMap(Comparator.reverseOrder());// sap xep giam dan
		modelMap.put(43, "DN");
		modelMap.put(92, "QN");
		modelMap.put(75, "Hue");
		modelMap.put(74, "QT");
		modelMap.put(73, "QB");
		return modelMap;
	}
	
	
	
	private static Map<Integer, String> sortUsingJava08(Map<Integer, String> modelMap){
		return modelMap.entrySet().stream().sorted(Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)->e2,LinkedHashMap::new));
		
	}
//	
//	private static Map<Integer, String> sort(Map<Integer, String> modelMap){
//		// B1: Convert to set <Entry <k, V>>
//	// B2': convert to list
//				//Set<Entry<Integer, String>> entrySet= modelMap.entrySet();
//				// B2: Sort
//				List<Entry<Integer, String>> sortList = new LinkedList<>(modelMap.entrySet());
//				sortList.sort(Entry.comparingByKey());
//				// B3: Transfers Set<Entry<k,v>> back to Map
//				Map<Integer, String> sortMap = new LinkedHashMap<>();	
//				sortList.forEach(entry->{
//					sortMap.put(entry.getKey(), entry.getValue())
//				});
//		return modelMap;
//		
//	}
	
	private static Map<Integer, String> sort(Map<Integer, String> modelMap) {

	List<Entry<Integer, String>> entryList = new LinkedList<>(modelMap.entrySet());
		entryList.sort(Entry.comparingByKey());
		// b3:
		Map<Integer, String> sortMap = new LinkedHashMap<Integer, String>();
		entryList.forEach(entry -> {
			sortMap.put(entry.getKey(), entry.getValue());
		});
	return sortMap;
}
}
