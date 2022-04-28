package Programs;

public class ReverseOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str ="My name is jully";
		
		String s2 ="";
		for(int i=str.length()-1;i>=0;i--) {
			s2 =s2 +str.charAt(i);
			
		}
		System.out.println(s2);*/
		
		/*String str="My name is jully";
		String rev="";
		String[] split = str.split(" ");
		
		for(int i=split.length-1;i>=0;i--) {
			rev=rev+" "+split[i];			
		}
		System.out.println(rev);*/
		
		String str="My name is jully";
		String str2="";
		String str3="";
		String[] split=str.split(" ");
		
		for(int i=0; i<split.length;i++) {
			str2=str2+" " + split[i];
			for(int j=str2.length()-1;j>=0;j--) {
				str3=str3+str2.charAt(j);
				System.out.println(str3);
			}
			
		}
		System.out.println(str3);
		
		
		
		
		

	}

}
