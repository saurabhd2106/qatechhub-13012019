package day11;

public class SwitchCaseStatement {
	
	public static void main(String[] args) {
		
		//0 - sunday, 1- Monday, 6- Saturday and so on..
		
		int day;
		
		day = 4;
		
		switch (day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			
		}
	}

}
