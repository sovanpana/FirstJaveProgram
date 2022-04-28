package Programs;

public class StringSplit {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "my name is jully";
		String s2="";
		/*String[] ss=s1.split("");
		
		for(int i=ss.length-1;i>=0;i--) {
			s2=s2+ss[i];
		}
		System.out.println(s2);*/
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		

	}

}
