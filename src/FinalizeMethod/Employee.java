package FinalizeMethod;

public class Employee {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e =null;
		System.gc();		
		System.out.println("employee class -------------");


	}
	@Override
	public void finalize() {
		System.out.println("finalize method of employee class");
	}
	

}
