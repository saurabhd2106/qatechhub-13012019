package day11;

public class MaximumValueOutOfAnArray {
	
	public static void main(String[] args) {
		int arr[] = new int[8];

		arr[0] = 90;
		arr[1] = 78;
		arr[2] = 89;
		arr[3] = 19;
		arr[4] = 67;
		arr[5] = 96;
		arr[6] = 23;
		arr[7] = 71;
		
		int max = arr[0]; int min = arr[0];
		
		for(int temp:arr){
			if(max < temp){
				max = temp;
			}
			if(min>temp){
				min = temp;
			}
		}
		
		System.out.println("Maximum : "+ max);
		
		System.out.println("Minimum : "+ min);
	}

}
