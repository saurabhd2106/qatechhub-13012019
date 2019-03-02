package day14;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapsExample {

	public static void main(String[] args) {
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(1000, "Saurabh Dhingra");
		treeMap.put(1006, "Hargun");
		treeMap.put(1002, "Rakshit");
		
		
		treeMap.put(1008, "Ayush");
		treeMap.put(1003, "Minal");
		treeMap.put(1002, "Rahul");
		
		for(Map.Entry<Integer, String> temp: treeMap.entrySet()){
			System.out.println("Key :: "+ temp.getKey() + " Value : "+ temp.getValue());
		}

	}

}
