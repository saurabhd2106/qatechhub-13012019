package day14;

import java.util.HashSet;
import java.util.Set;

public class UniqueValueExample {
	
	public static void main(String[] args) {
		String[] str = new String[7];
		
		Set<String> hashSet = new HashSet<>();
		
		str[0] = "Saurabh";
		str[1] = "Gaurav";
		str[2] = "Rohan";
		str[3] = "Rakshit";
		str[4] = "Rakshit";
		str[5] = "Saurabh";
		str[6] = "Saurabh";
		
		for(String temp:str){
			hashSet.add(temp);
		}
		
		System.out.println("Unique values : "+hashSet.size());
	}

}
