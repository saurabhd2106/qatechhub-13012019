package day11;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		int num = 90;
		
		while (num> 100){
			System.out.println("number is greater");
			num = num-1;
		}
		
		
		//------------------------------------------
		
		do {
			
			System.out.println(num + " : Number is greater than 100");
			
		} while (num> 100);
		
	}
	
	

}
