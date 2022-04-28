package DataTypes;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = "hello";

		if (s1.equals(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("fail");
		} // output: fail

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("same");
		} // output: same

		if (s1 == s2) {
			System.out.println("sameeee");
		} else {
			System.out.println("not sameeeee");
		}

	}

}
