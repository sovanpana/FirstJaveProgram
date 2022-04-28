package ConstructorPackage;

import java.util.ArrayList;

public class CheckWithoutMainMethod {
	String name;
	int age;
	String dept;
	String empId;
	ArrayList<String> empList;
	
	public CheckWithoutMainMethod() {
		System.out.println("Default constructor.......");
	}
	public CheckWithoutMainMethod(String name,ArrayList<String> empList) {
		this.name=name;
		this.empList=empList;
		System.out.println("ArrayList called.......");
	}
	
	public CheckWithoutMainMethod(int i) {
		this.age=i;
		System.out.println("1 parameter constructor.......");
		
	}
	public CheckWithoutMainMethod(String i) {
		System.out.println("1 string parameter constructor.......");
	}
	public CheckWithoutMainMethod(int i,String j,String k) {
		System.out.println("3 parameter constructor.......");
	}
	public CheckWithoutMainMethod(int i,String j,String k,int n) {
		System.out.println("4 parameter constructor.......");
	}

}
