package DataTypes;

import java.util.ArrayList;

public class ArrayListUsingSwitchCase {
	
	//WAF --getProductDetails
	//input-- company name
	//output -- get product list like dress name,price,number of product available
	//use switch case
	
	
	public ArrayList<Object> getProductDetails(String companyName) {
		ArrayList<Object> prodDetails = new ArrayList<Object>();
		switch (companyName.toLowerCase()) {
		case "amazon":
			System.out.println("Amazon");
			prodDetails.add("Men cloth section");
			prodDetails.add(2000);
			prodDetails.add(800);			
			break;
		case "myntra":
			System.out.println("Myntra");			
			prodDetails.add("Women cloth section");
			prodDetails.add(5000);
			prodDetails.add(500);			
			break;

		default:
			System.out.println("Pass correct company name");
			break;
		}
		return prodDetails;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListUsingSwitchCase info =new ArrayListUsingSwitchCase();
		ArrayList<Object> results=info.getProductDetails("Myntra");
		System.out.println("product size : "+ results.size());
		for(Object e:results) {
			System.out.println(e);
		}

	}

}
