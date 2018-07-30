package com.maps.pramp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class WordCount2 {
	public static void main(String[] args) {
		String inputStr = "Only Practice makes perfect. you'll only get Perfect by practice. just practice!";
		inputStr = inputStr.replaceAll("[^A-Z0-9a-z\\'\\s]", "").toLowerCase();
		System.out.println(inputStr);
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		String[] strArray = inputStr.split(" ");
		
		for (String s : strArray) {
			if (hmap.containsKey(s))
				hmap.put(s, hmap.get(s) + 1);
			else 
				hmap.put(s, 1);
		}
		
		LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
		
		linkedMap = sortHashMapByValues(hmap);
		
		System.out.println("Result: ");
		
		for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + ", " + value);
		}
	}
         
  public static LinkedHashMap<String, Integer> sortHashMapByValues(
        HashMap<String, Integer> passedMap) {
    List<String> mapKeys = new ArrayList<>(passedMap.keySet());//[practice, perfect, you'll, get, by, only, makes, just]
    List<Integer> mapValues = new ArrayList<>(passedMap.values());//[3, 2, 1, 1, 1, 2, 1, 1]
    Collections.sort(mapValues);
    Collections.reverse(mapValues);//[3, 2, 2, 1, 1, 1, 1, 1]
    
    Collections.sort(mapKeys);
    Collections.reverse(mapKeys);//[you'll, practice, perfect, only, makes, just, get, by]

    LinkedHashMap<String, Integer> sortedMap =
        new LinkedHashMap<>();

    Iterator<Integer> valueIt = mapValues.iterator();
    while (valueIt.hasNext()) {
        Integer val = valueIt.next();
        Iterator<String> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) {
            String key = keyIt.next();
            Integer comp1 = passedMap.get(key);
            Integer comp2 = val;

            if (comp1.equals(comp2)) {
                keyIt.remove();
                sortedMap.put(key, val);
                break;
            }
        }
    }
    return sortedMap;
	}
}