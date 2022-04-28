package DataTypes;

public class OverloadCheck {
	public void test() {
		System.out.println("11111111111");
	}
	public void test(int i) {
		System.out.println("22222222222");
	}
	public void test(double i) {
		System.out.println("33333333333333");
	}
	public void test(int i,int j) {
		System.out.println("44444444444444444");
	}
	public void test(int j,String p) {
		System.out.println("55555555555555");
	}
	public void test(String p,int j) {
		System.out.println("6666666666666");
	}public void test(String j) {
		System.out.println("77777777777777777777");
	}
	public void test(int i,double j) {
		System.out.println("8888888888888888888888");
	}
	public void test(String i,String j) {
		System.out.println("99999999999");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
