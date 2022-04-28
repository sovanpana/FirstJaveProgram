package Programs;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"jully","lincon","riann","riann","Riann"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println("duplicate element is : "+ name[i]);
				}
			}
		}

	}

}
