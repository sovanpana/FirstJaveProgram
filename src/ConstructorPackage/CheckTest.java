package ConstructorPackage;

import java.util.ArrayList;

public class CheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckWithoutMainMethod cc= new CheckWithoutMainMethod(5);
		System.out.println(cc.name); //null
		System.out.println(cc.age);  //5
		
		ArrayList<String> aa= new ArrayList<String>();
		aa.add("first batch");
		aa.add("second batch");
		
		CheckWithoutMainMethod cc1= new CheckWithoutMainMethod("Jully", aa);
		System.out.println(cc1.name);
		System.out.println(cc1.empList);

	}

}
