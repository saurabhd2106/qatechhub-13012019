package day5;

public class Demo3dShape {

	public static void main(String[] args) {
		ThreeDShape cyl = new Cylinder();
		
		System.out.println(cyl.calculateVolume(10, 20));
		
		
		
		ThreeDShape cub = new Cuboid();
		
		System.out.println(cub.calculateVolume(10, 20));

	}

}
