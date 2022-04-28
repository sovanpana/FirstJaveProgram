package DataTypes;

public class ClassAndObject {
	
	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObject e1=new ClassAndObject();
		e1.name="jully";
		e1.age=30;
		
		ClassAndObject e2=new ClassAndObject();
		e2.name="lincon";
		e2.age=32;
		
		ClassAndObject e3=new ClassAndObject();
		e3.name="Riaan";
		e3.age=1;
		
		e1=e2;
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		e2=e3;
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		e3=e1;
		System.out.println(e3.name);
		System.out.println(e3.age);
		
		e3=e1;
		System.out.println(e1.name);
		System.out.println(e1.age);
		
				
				

	}

}
