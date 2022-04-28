package Programs;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {-88,0,5,8,100};
		int smallest=a[0];
		int largest=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest= a[i];
			}
			else if (a[i]<smallest) {
				smallest=a[i];
			}
			
		}
		System.out.println("Given number is : " + Arrays.toString(a));
		System.out.println(largest);
		System.out.println(smallest);

	}

}
