package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	// bien so xe - tinh/thanhpho
	public static void main(String[] args) {
		Map<Integer, String> modelMap=new HashMap<Integer, String>();
		modelMap.put(43, "Da Nang");
		modelMap.put(75, "Hue");
		modelMap.put(92, "Quang Nam");
		modelMap.put(74, "Quang Tri");
		
		String removed=modelMap.remove(92);
		System.out.println("removed value: "+removed);
		
		System.out.println("size: "+modelMap.size());
		printf(modelMap);
		
		
		//tim thanh pho co ma 74
		
		String f1=modelMap.get(74);
		String f2=modelMap.getOrDefault(99, "Viet Nam");
		
		System.out.println("f1: "+f1);
		System.out.println("f2: "+f2);
		
		
	}
	private static void printf(Map<Integer, String> modelMap) {
		
		//loop value
		Collection<String>value=modelMap.values();
		
		//loop key
		Set< Integer> key=modelMap.keySet();
		
		//loop entry
		 Set<Entry<Integer, String>> entrySet=modelMap.entrySet();
		 
		 for(Entry<Integer, String> entry:entrySet) {
			 System.out.println("Entry: "+entry);
			 System.out.println("Key: "+entry.getKey());
			 System.out.println("Value: "+entry.getValue());
		 }
	}
}
