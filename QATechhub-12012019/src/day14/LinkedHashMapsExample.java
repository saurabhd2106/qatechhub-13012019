package day14;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapsExample {

	public static void main(String[] args) {
		
		Map<Integer, String> linkedMap = new LinkedHashMap<>();
		
		linkedMap.put(1000, "Saurabh Dhingra");
		linkedMap.put(1006, "Hargun");
		linkedMap.put(1002, "Rakshit");
		
		
		linkedMap.put(1008, "Ayush");
		linkedMap.put(1003, "Minal");
		linkedMap.put(1002, "Rahul");
		
		for(Map.Entry<Integer, String> temp: linkedMap.entrySet()){
			System.out.println("Key :: "+ temp.getKey() + " Value : "+ temp.getValue());
		}

	}

}
