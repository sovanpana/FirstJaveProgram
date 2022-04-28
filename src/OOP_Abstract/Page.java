package OOP_Abstract;

public abstract class Page {
/*	
	public Page() {
		System.out.println("Page default constructor............");
	}
	public Page(int i) {
		System.out.println("Page one param constructor............");
	}
	*/
	
	public abstract void title();
	public abstract void url();
	
	public void doLogin(String uname,String pwd) {
		System.out.println("Login............page");
	}
	
	public static void logo() {
		System.out.println("Logo......................");
	}
	
	public final void priceCalculate() {
		System.out.println("calculate price .............");
	}
	

}
