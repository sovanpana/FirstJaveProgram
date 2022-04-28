package DataTypes;

public class IncrementalDecrementalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. post incremental
		int a =10;
		int b =a++;
		System.out.println(a); //11
		System.out.println(b); //10
		
		System.out.println(a++); //11
		System.out.println(a); //12
		
		//2. pre incremental
		int c=100;
		int d=++c;
		System.out.println(d); //101
		System.out.println(c); //101
		
		System.out.println(++c); //102
		System.out.println(c); //102
		
		//3.post decremental
		int e=500;
		int f=e--;
		System.out.println(f); //500
		System.out.println(e); //499
		
		//4. pre decremental
		int g=600;
		int h=--g;
		System.out.println(h); //599
		System.out.println(g); //599
		
		
		char m='A';
		System.out.println(++m); //B
		System.out.println((int)++m); //67
		
		char n='a';
		System.out.println(++n); //b
		System.out.println((int)++n); //99
		
		
		char p='b';
		System.out.println((int)++p); //99

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int t=10;
		System.out.println(t++);
		System.out.println(t);
		
		char l='a';
		System.out.println(l++);
		
		
		if(true) {
			System.out.println("hi");
		}else {
			System.out.println("bye");		
		
	}
		
		for(int i=5;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
		}}
		

}}

