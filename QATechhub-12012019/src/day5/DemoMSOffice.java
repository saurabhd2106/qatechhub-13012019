package day5;

public class DemoMSOffice {

	public static void main(String[] args) {
		MSOffice msexcel = new MSExcel();
		MSOffice msword = new MSWord();
		
		MSExcel msExcel1 = new MSExcel();
		msexcel.start();
		
		msword.start();

		msExcel1.rerun();
	}

}
