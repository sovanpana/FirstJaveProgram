package StringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello this is my java code";
		char str1 = '1';
		String s=Character.toString(str1);
		boolean b1=Boolean.parseBoolean(s);
		if(b1) {
		System.out.println(b1);
		}
		else System.out.println("false");
	
		//length
		int size= str.length();
		System.out.println("Size of string is : " + size);
		
		//To get the specific character present in a particular index
		
		char aa = str.charAt(25);
		System.out.println("Character at 25th index : " + aa);
		
		//Get the last character of a String
		char lastChar = str.charAt(str.length()-1);
		System.out.println("lastChar of String is : "+ lastChar);
		
		//Get first character od a String(lowerst index is always 0
		char firstChar = str.charAt(0);
		System.out.println("firstChar is : "+ firstChar);
		
		//System.out.println(str.charAt(26)); -- StringIndexOutOfBoundException
		//System.out.println(str.charAt(-1));  -- StringIndexOutOfBoundException
		
		//provide the index of specific character
		System.out.println("Index is : " + str.indexOf('H')); 
		System.out.println("Index is : " + str.indexOf('q'));
		
		//first occurance of character
		System.out.println("Index is : " + str.indexOf('i'));  
		System.out.println("Index is : " + str.indexOf('l')); 
		//To get the index of second occurance of character l
		System.out.println("Index is : " + str.indexOf('i', 9)); 
		System.out.println("Index is : " + str.indexOf('l', 3));
		
		//but above code will not work if something got added in middle of string, so can be written as below
		System.out.println("Index is : " + str.indexOf('i', str.indexOf('i')+1)); 
		
		String str2 = "Hello this is my is java code";
		//get the index of third occurance of i
		//System.out.println("Index is : " + str1.indexOf('i'+1, str.indexOf('i')+1));
		
		//get the position of a word
		System.out.println("Position of a word : "+ str.indexOf("java"));
		System.out.println("Position of a word : "+ str.indexOf("world"));
		System.out.println("Position of a word : "+ str.indexOf("hello"));
		System.out.println("Position of a word : "+ str.indexOf("Hello"));
		
		String s1= "Hello World";
		String s2= "Hello World";
		System.out.println(s1==s2);
		
		
		String p1="Selenium";
		for(int i=p1.length()-1;i>=0;i--) {
			System.out.print(p1.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
