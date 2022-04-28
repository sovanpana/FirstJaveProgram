package ConstructorPackage;

public class Employee {
	String name;
	int age;
	String dept;
	String empId;
	public Employee() {
		System.out.println("Default constructor.......");
	}
	public Employee(int i) {
		System.out.println("1 parameter constructor.......");
	}
	public Employee(String i) {
		System.out.println("1 string parameter constructor.......");
	}
	public Employee(int i,String j,String k) {
		System.out.println("3 parameter constructor.......");
	}
	public Employee(int i,String j,String k,int n) {
		System.out.println("4 parameter constructor.......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(5,"IT Dept","2324234",6);

	}

}
