package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		arrayList.add(100);
		arrayList.add(150);
		arrayList.add(160);
		arrayList.add(200);
		arrayList.add(10);
		
		System.out.println(arrayList);
		
		arrayList.add(2, 500);
		
		System.out.println(arrayList);
		
		System.out.println("Value at : "+arrayList.get(4));
		
		for(Integer temp: arrayList){
			
			System.out.println(temp);
		}
		
		//---------------------------------------------------------------------
		
		long startTime = System.currentTimeMillis();
		long endTime;
		
		for(int i=0; i<10E4; i++){
			arrayList.add(0,i);
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Time of execution :: "+(endTime - startTime) + "milliseconds");
		
		System.out.println("--------------------------------------------------");
		
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<10E5; i++){
			linkedList.add(0,i);
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Time of execution :: "+(endTime - startTime) + "milliseconds");
	}

}
