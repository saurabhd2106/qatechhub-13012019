package day10;

public class DemoMultipleBrowserTesting {

	public static void main(String[] args) {
		MultipleBrowserTesting mb = new MultipleBrowserTesting();

		try {
			mb.invokeBrowser("firefox");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
