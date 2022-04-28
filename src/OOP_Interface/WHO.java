package OOP_Interface;

public interface WHO {
	
	public void covidTest();
	public void Vaccrination();
	
	public static void report() {
		System.out.println("who.........report");
	}
	
	default void actionsReport() {
		System.out.println("WHO.... actionreport");
	}

}
