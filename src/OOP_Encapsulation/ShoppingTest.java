package OOP_Encapsulation;

public class ShoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EcommApp ee =new EcommApp();
		ee.login()
		         .search("cloth")
		                    .addToCart("selected cloth")
		                             .doPayment(1111, 123)
		                                     .logout();

	}

}
