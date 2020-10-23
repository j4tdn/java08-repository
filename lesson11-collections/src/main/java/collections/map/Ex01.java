package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Ex01 {
	//Bien so xe ung vs tp o VN
	public static void main(String[] args) {
		Map<Integer, String> modelMap =new HashMap<>();
		modelMap.put(43, "DN");
		modelMap.put(92, "QN");
		modelMap.put(75, "Hue");
		modelMap.put(74, "QT");
		modelMap.put(73, "QB");
		String removed= modelMap.remove(75);
		System.out.println("removed value: " + removed);
		
		System.out.println("size: "+modelMap.size());
		printf(modelMap);
		
		
	}
	
	private static void printf(Map<Integer, String> modeMap) {
		
		
		Set<Entry<Integer, String>>  entrySet =modeMap.entrySet();
		
		for (Entry<Integer, String> entry: entrySet) {
			System.out.println(entry);
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//look value 
				Set<Integer> key = modeMap.keySet();
				
				//look key
				Collection<String> value=modeMap.values();
				
				// tim ma tp
				String f1=modeMap.get(43);
				String f2= modeMap.get(99);
				System.out.println("f1: "+f1+"              f2: "+f2);
				
				
				
	
	}
	
	
}
