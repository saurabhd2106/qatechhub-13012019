package day5;

public abstract class ThreeDShape {
	
	public double calculateVolume(int len, int height){
		
		double volume = calculateArea(len) * height;
		
		return volume;
	}
	
	public abstract double calculateArea(int len);

}
