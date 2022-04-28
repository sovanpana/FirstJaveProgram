
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		//System.out.println(x+20); ---10020
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String y="100A";
		
		System.out.println(y.substring(0, 3));
		//System.out.println(y+20);	 --100A20
		//int p=Integer.parseInt(y);
		//System.out.println(p+20);	 -- Number format exception
		
		/*String str=y.replace("A", "");
		int s=Integer.parseInt(str);
		System.out.println(s+20);*/
		
		String name ="My order id is 6786";
		String ss[] = name.split("is");
	
			System.out.println(ss.length);
			System.out.println(ss[1].trim());
			System.out.println(name.substring(15, 19));
		
		
		

	}

}
