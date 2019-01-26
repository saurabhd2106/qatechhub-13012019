package day5;

public class DemoShape {

	public static void main(String[] args) {
		Shape cir = new Shape();
		
		Shape sqr = new Shape();
		
		Shape rec = new Shape();
		
		
		double areaOfCir = cir.calculateArea(90.5);
		
		double areaOfSqr = sqr.calculateArea(90);
		
		double areaOfRec = rec.calculateArea(90, 10);
		
		System.out.println("Area of Circle : "+ areaOfCir);
		System.out.println("Area of Square : "+ areaOfSqr);
		System.out.println("Area of Rectangle : "+ areaOfRec);

	}

}
