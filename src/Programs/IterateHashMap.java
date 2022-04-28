package Programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashMap<String,Integer> hm= new HashMap<String,Integer>();
	hm.put("Jully", 1);
	hm.put("Lincon", 2);
	hm.put("Riaan", 3);
	
	System.out.println(hm);
	for(Entry<String, Integer> e: hm.entrySet()) {
		System.out.println("Key is : "+ e.getKey() + ":" + "value is : "+ e.getValue());
		
		
	}

	}

}
