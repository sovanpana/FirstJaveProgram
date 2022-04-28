package DataTypes;

public class OpenBrowserUsingSwitch {

	public boolean switchBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("opened chrome");
			return true;			
		case "ff":
			System.out.println("opened ff");
			return true;	

		default:
			System.out.println("pass correct name");
			return false;
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenBrowserUsingSwitch bb= new OpenBrowserUsingSwitch();
		boolean value=bb.switchBrowser("safari");
		if(value) {
			System.out.println("Correct browser found and passed");
		}
		else
			System.out.println("pass correct one");

	}

}
