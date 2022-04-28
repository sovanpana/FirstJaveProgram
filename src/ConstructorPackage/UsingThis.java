package ConstructorPackage;

public class UsingThis {
	String username;
	String pwd;
	int otp;
	public UsingThis(String username) {
		this.username=username;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThis u1=new UsingThis("jully");
		System.out.println(u1.username);

	}

}
