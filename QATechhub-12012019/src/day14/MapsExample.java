package day14;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		
		Map<Integer, String> hashmap = new HashMap<>();
		
		hashmap.put(1000, "Saurabh Dhingra");
		hashmap.put(1002, "Rakshit");
		hashmap.put(1003, "Minal");
		hashmap.put(1006, "Hargun");
		hashmap.put(1008, "Ayush");
		
		hashmap.put(1002, "Rahul");
		
		for(Map.Entry<Integer, String> temp: hashmap.entrySet()){
			System.out.println("Key :: "+ temp.getKey() + " Value : "+ temp.getValue());
		}

	}

}
