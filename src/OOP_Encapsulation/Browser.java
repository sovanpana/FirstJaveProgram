package OOP_Encapsulation;

public class Browser {
	public void launchBrowser() {
		checkOs();
		checkRAM();
		System.out.println("Everything checked and now brower will launch soon");
		
	}
	private void checkOs() {
		System.out.println("Check the OS");
	}
	private void checkRAM() {
		System.out.println("Check the RAM");
		
	}

}
