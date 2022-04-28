package OOP_Encapsulation;

public class EcommApp {
	
	public EcommApp login() {
		System.out.println("Default login");
		return this;
		
	}
	public EcommApp login(String username,String pwd) {
		System.out.println("Login using un and pwd");
		return this;
	}
	public EcommApp search(String productname) {
		System.out.println("search product name");	
		return this;
	}
	public EcommApp search(String productname,int price) {
		System.out.println("search product name with price details");
		return this;
	}
	public EcommApp addToCart(String productname) {
		System.out.println("Added to cart");	
		return this;
	}
	public EcommApp doPayment(int cc,int cvv) {
		System.out.println("payment through cc and cvv number");	
		return this;
	}
	public EcommApp doPayment(int cc,int cvv,int otp) {
		System.out.println("payment through cc,cvv,otp number");	
		return this;
	}
	public EcommApp logout() {
		System.out.println("logged out");		
		return this;
	}

}
