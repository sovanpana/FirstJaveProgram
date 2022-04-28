package Programs;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int n1=n;
		int sum=0;
		int remainder=0;
		while(n>0) {
			remainder=n%10;
			 sum=sum +(remainder*remainder*remainder);
			 n=n/10;
			
		}
		if(n1==sum) {
			System.out.println("amstrong");
		}else {
			System.out.println("not");
		}

	}

}
