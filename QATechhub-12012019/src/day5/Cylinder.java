package day5;

public class Cylinder extends ThreeDShape{

	@Override
	public double calculateArea(int radius) {
		
		return Math.PI * radius * radius;
	}

}
