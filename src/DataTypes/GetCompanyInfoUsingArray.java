package DataTypes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GetCompanyInfoUsingArray {

	// WAF -- getComapnyInfo
	// input to method --companyName
	// output --get company name,location,number of employee,share price,md name

	public Object[] getComapnyInfo(String companyName) {
		Object companyArray[] = new Object[5];

		if (companyName.equals("Sabre")) {
			companyArray[0] = "Sabre";
			companyArray[1] = "Banaglore";
			companyArray[2] = 1000;
			companyArray[3] = 5.5;
			companyArray[4] = "MR Sourabh";

		} else if (companyName.equals("Harman")) {
			companyArray[0] = "Harman";
			companyArray[1] = "Banaglore";
			companyArray[2] = 2200;
			companyArray[3] = 6.5;
			companyArray[4] = "MR Riann";

		} else {
			System.out.println("pass correct company name");
		}
		return companyArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetCompanyInfoUsingArray comapnyInfo = new GetCompanyInfoUsingArray();
		Object info[]=comapnyInfo.getComapnyInfo("Harman");
		/*for (Object e:info) {
			System.out.println(e);
		}*/
		System.out.println(Arrays.toString(info));

	}

}
