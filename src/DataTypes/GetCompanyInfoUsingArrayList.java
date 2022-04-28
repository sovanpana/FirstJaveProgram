package DataTypes;

import java.util.ArrayList;

public class GetCompanyInfoUsingArrayList {
	public ArrayList<Object> getCompanyInfo(String companyName) {
		ArrayList<Object> aa = new ArrayList<Object>();

		if (companyName.equals("IBM")) {
			aa.add("IBM");
			aa.add("Bangalore");
			aa.add(2000);
			aa.add(7.8);
		} else if (companyName.equals("HARMAN")) {
			aa.add("HARMAN");
			aa.add("Bangalore");
			aa.add("TRUE");
		} else {
			System.out.println("Pass correct company name");
		}
		return aa;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetCompanyInfoUsingArrayList info = new GetCompanyInfoUsingArrayList();
		ArrayList<Object> output=info.getCompanyInfo("HARMAN");
		System.out.println(output);

	}

}
