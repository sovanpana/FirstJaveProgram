package ConstructorPackage;

public class ConstructorCalling {

	String name; //lincon --jully
	int age;  ///31 --30
	double salary;

	public ConstructorCalling(String name, int age) {

		this.name = name;
		this.age = age;
	}
	public ConstructorCalling(String name, int age,double salary) {
        this("lincon",31);
		this.name = name;
		this.age = age;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCalling cc =new ConstructorCalling("jully",30,5.55);
		System.out.println(cc.name);
		System.out.println(cc.age);

	}

}
