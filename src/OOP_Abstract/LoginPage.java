package OOP_Abstract;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LoginPage default constructor............");
	}

	public LoginPage(int i) {
		System.out.println("LoginPage one param constructor............");
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("title.............");
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("url..............");
		
	}
	
	@Override
	public void doLogin(String uname,String pwd) {
		System.out.println("Login............LoginPage");
	}
	
	public void forgotPwd() {
		System.out.println("Forgot pwd..........");
	}

}


