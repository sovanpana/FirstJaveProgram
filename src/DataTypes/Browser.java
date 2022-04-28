package DataTypes;

import java.lang.invoke.SwitchPoint;

public class Browser {
	
	/*public void launchBrowser(String name) {
		if(name.equalsIgnoreCase("FF")) {
			//write logic to open ff
			System.out.println("FF opened");			
			
		}else 
			if(name.equalsIgnoreCase("IE")) {
				//write logic to open ff
				System.out.println("IE opened");			
				
			}
			else
				System.out.println("pass correct browser");
		
	}
*/
	
	//write the above logic using switch case
	
	public void launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			System.out.println("Open chrome");
			break;
		case "FF":
			System.out.println("Open FF");
			break;

		default:
			System.out.println("pass correct browser");
			break;
		}
		
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bb.launchBrowser("FF");
		String browser ="FF";
		Browser bb= new Browser();
		bb.launchBrowser("FF");
		
		
	

	}

}
