package day11;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		arr[0][0] = 7;
		arr[0][1] = 8;
		arr[0][2] = 9;
		
		arr[1][0] = 17;
		arr[1][1] = 81;
		arr[1][2] = 92;
		
		arr[2][0] = 74;
		arr[2][1] = 85;
		arr[2][2] = 97;
		
		for(int i=0; i< 3; i++){
			for(int j=0; j<3; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
