package day11;

public class ArraysExample {

	public static void main(String[] args) {
		// Static way of declaration

		int[] arr = { 89, 90, 100, 78, 45 };

		int arr1[] = { 78, 90, 34, 23, 89 };

		// Dynamic way of declaration

		int[] arr3 = new int[8];

		int arr4[] = new int[8];

		arr3[0] = 90;
		arr3[1] = 78;
		arr3[2] = 89;
		arr3[3] = 19;
		arr3[4] = 67;
		arr3[5] = 56;
		arr3[6] = 23;
		arr3[7] = 71;
		
		System.out.println(arr[4]);
		
		//--------------------------------------
		
		//Get the size of array!!
		
		System.out.println(arr3.length);
		
		System.out.println("---------------------------------------------------");
		for(int i=0; i< arr3.length; i++){
			
			System.out.println(arr3[i]);
		}
		
		System.out.println("---------------------------------------------------");
		
		//Enhanced for loop or for-each loop
		
		for(int temp:arr3){
			
			System.out.println(temp);
		}
		

	}

}
