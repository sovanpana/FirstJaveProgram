package DataTypes;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x= "Hello";
		String y="world";
		
		int a =100;
		int b =200;
		
		double d1=12.33;
		double d2=23.44;
		
		int h=10;
		int p=2;
				
		
		System.out.println(x+y); //Helloworld
		System.out.println(a+b); //300
			
		System.out.println(a+b+x+y); //300Helloworld
		System.out.println(x+y+a+b); //Helloworld100200
		//System.out.println(x+y-a+b); ---error (can't use -,*,/ operator for strimg, only + can be used for concatination)
		System.out.println(x+y+(a+b));	//Helloworld300
		//System.out.println(x-y+a+b);//syntax error
		
		
		System.out.println(9/3); //3
		System.out.println(9.0/3); //3.0
		System.out.println(9/3.0); //3.0
		
		//System.out.println(9/0); //Arithmetic exception
		System.out.println(9.0/0); //Infinity
		System.out.println(9/0.0); //Infinity
		
		//System.out.println(0/0); //Arithmetic exception
		System.out.println(0.0/0.0);//NaN (not a number)
		
		System.out.println(0/9);//0
		System.out.println(0.0/9);//0.0
		
		
		System.out.println(8%2);//0
		System.out.println(9%2);//1
		
		System.out.println(9.2%2);
		

	}

}
