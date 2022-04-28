package DataTypes;

import java.util.Arrays;

public class ArrayConept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5  	];
		a[0] = 'c';
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//for each loop
		for(int e:a) {
			System.out.println(e);
		}
		
		System.out.println("............");
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		//character array
		char c[]=new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='1';
		System.out.println(c[0]+c[1]); //195
		System.out.println(Arrays.toString(c));//[a,b,c, ]
		
		//String array
		String name[]=new String[4];
		name[0]="jully";
		name[1]="lincon";
		name[2]="Riaan";
		
		System.out.println(Arrays.toString(name));
		for(String e:name) {
			System.out.println(e);
		}
		
		
		System.out.println(".....................................");
		Object emp[]=new Object[3];
		emp[0]="jully";
		emp[1]="female";
		//emp[2]=30;
		System.out.println(Arrays.toString(emp));
		for(Object e:emp) {
			System.out.println(e);
		}
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
			
		}
		
		
		

	}

}
