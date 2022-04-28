package DataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> empList= new ArrayList<String>();
		empList.add("Tom");
		empList.add("Naveen");
		empList.add("Haroon");
		empList.add("Keshav");
		
		System.out.println(empList);
		/*
		//sort:
		Collections.sort(empList);
		System.out.println(empList);
		
		//reverse order
		Collections.sort(empList,Collections.reverseOrder());
		System.out.println(empList);*/
		
		System.out.println(".........");
		for(int i=empList.size()-1;i>=0;i--) {
			System.out.println(empList.get(i));
			
		}
		
		ArrayList<String> empList1= new ArrayList<String>();
		empList1.add("jully");
		empList1.add("lincon");
		empList1.add("riaan");
		
		/*empList1.addAll(empList);
		System.out.println(empList1);*/
		
		empList.addAll(empList1);
		System.out.println(empList);
		
		System.out.println(">>>>>>>>>>");
		//ArrayList<Integer> li= new ArrayList<Integer>();
		List<Integer> li1=Arrays.asList(10,20,30);
		System.out.println(li1);
		
		
		

	}

}
