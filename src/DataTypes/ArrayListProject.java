package DataTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add("jully");
		al.add('f');
		al.add(0, 200);
		System.out.println(al.get(0));

		ArrayList<String> all = new ArrayList<String>();
		all.add("Jully");
		all.add("jully");
		all.add("Lincon");
		all.add("F");

		System.out.println(all);

		for (int i = 0; i < all.size(); i++) {
			System.out.println(all.get(i));
		}

		for (String s : all) {
			System.out.println(s);
			if (s.equals("F")) {
				System.out.println("female employee");
			}
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		
		ArrayList<Object> alll = new ArrayList<Object>();
		alll.add("jully");
		alll.add(30);
		alll.add('f');
		alll.add(12.33);
		
		for(int i=0;i<alll.size();i++) {
			System.out.println(alll.get(i));
		}
		
		
		for(Object e:alll) {
			System.out.println(e);
			if(e.equals('f')) {
				System.out.println("female");
			}
		}
		System.out.println("??????????????");
		System.out.println(alll);
		System.out.println(">>>>>>>>>>>>>>>>>>");
		
		Object obj[] = new Object[3];
		obj[0]='1';
		obj[1]=2;
		//obj[2]=3;		
		System.out.println(Arrays.toString(obj));
		
		ArrayList aa =new ArrayList();
		aa.add(100);
		
		
		
		
		
				
						
		
		
		

	}

}
