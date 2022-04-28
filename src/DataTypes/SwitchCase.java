package DataTypes;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chr    ome ";

		switch (browser.toLowerCase().trim().replace(" ", "")) {
		case "chrome":
			System.out.println("launch chrome");
			break;

		default:
			System.out.println("pass correct browser");
			break;
		}
        
		int mark = 100;

		switch (mark) {
		case 100:
			System.out.println("A");
			break;
		case 90:
			System.out.println("B");
			break;

		default:
			System.out.println("FAIL");
			break;
		}

//		// print the character and their ASCII values
//		for (char c = 'a'; c <= 'z'; c++) {
//			System.out.println(c + ":" + (int) c);
//
//		}
		
		
		//print 1,3,5,7,9
		for(int j=1;j<10;j=j+2) {
			System.out.println(j);
		
		}
		
		for(int p=1;p<10;p++) {
			if(p%2==1) {
				System.out.println(p);
			}
		}
		
		for(int s=0;s<10;s++) {
			if(s%2==0) {
				System.out.println(s);
			}
		}
		
		for(int r=5;r<100;r++) {
			if(r%5==0) {
				System.out.println(r);
			}
		}
	}
}
