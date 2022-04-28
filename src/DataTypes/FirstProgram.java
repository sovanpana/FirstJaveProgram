package DataTypes;
/*
 * @author Sovan
 * @This class is about datatypes in java
 */

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte : size=1 byte, range= -128 to 127
		byte b1=10;
		b1=20;
	  //b1=128; -- not allowed 
		
		//short: size=2 byte, range=-32768 to 32767
		short s1=1234;
		
		//int: size=4 byte
		int i = 1000;
		
		//long: size =8 byte
		//long l=1221313131231; --not allowed, value should append by l orL
		long l=1213131313131L;
		
		//float: size=4byte, after . it can take upto  7 digits
		//float f= 121212.00; -- not allowed, value should append by f
		float f=12.00f;
		//doubt
		float f1=12.12345678f;
		System.out.println("float f1 value is: " + f1);
		
		//double: size=8byte, it can take upto 15 digits
		double d=12.11111111111111;
		System.out.println("double d value is: " + d);
		
		
		//char: size=2byte
		//char c= 'aaa' -- not allowed, only single character it can take
		char c='a';
		char c1='1';
		System.out.println("character c1 value is : " + c1);
		
		//boolean size= ~1bit
		boolean b= true;
		
		
		
		
		
				

	}

}
