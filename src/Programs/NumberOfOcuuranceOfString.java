package Programs;

import java.util.HashMap;
import java.util.Iterator;

public class NumberOfOcuuranceOfString {
	
	String s1="My name is is jully jully";
	String s2="";
	String[] ss;
	
	public void numberOfOcuurance() {
		
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		String[] name=s1.split(" ");
		
		//int count=0;
		
		for(String e:name) {
			if(hm.get(e)!=null) {
				System.out.println("e is : "+ e);
				System.out.println("hm.get(e) is : "+ hm.get(e));
				hm.put(e, hm.get(e)+1);		
				
			}else {
			
			hm.put(e, 1);
			}			
		}
		System.out.println(hm);	
		
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String name1=it.next();			
			if(hm.get(name1)>1) {
				System.out.println("The word : "+ name1 +" " +"occured" + hm.get(name1)+ "times");
			}
				
		}
		
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberOfOcuuranceOfString ss= new NumberOfOcuuranceOfString();
		ss.numberOfOcuurance();
		

	}

}
