package day14;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Saurabh");
		hashSet.add("Gaurav");
		hashSet.add("Rahul");
		hashSet.add("Rakshit");
		hashSet.add("Ayush");
		hashSet.add("Hargun");
		hashSet.add("Gaurav");
		hashSet.add("Gaurav");
		
		System.out.println(hashSet);
		
		for(String temp:hashSet) {
			System.out.println(temp);
		}
		
		System.out.println("------------------------------------------------");
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

		linkedSet.add("Saurabh");
		linkedSet.add("Gaurav");
		linkedSet.add("Rahul");
		linkedSet.add("Rakshit");
		linkedSet.add("Ayush");
		linkedSet.add("Hargun");
		linkedSet.add("Gaurav");
		linkedSet.add("Gaurav");
		
		System.out.println(linkedSet);
		
		for(String temp:linkedSet) {
			System.out.println(temp);
		}
		
		TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());

		treeSet.add("Saurabh");
		treeSet.add("Gaurav");
		treeSet.add("Rahul");
		treeSet.add("Rakshit");
		treeSet.add("Ayush");
		treeSet.add("Hargun");
		treeSet.add("Gaurav");
		treeSet.add("Gaurav");
		
		System.out.println(treeSet);
		
		for(String temp:treeSet) {
			System.out.println(temp);
		}
	}

}
