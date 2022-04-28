package Programs;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,9,10,11};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		int sum1=0;
		for(int i=7;i<=11;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println("Missing number is : "+ (sum1-sum));

	}

}
