package DataTypes;

public class Student {

	/*public int getStudentMarks(String stundentName) {
		System.out.println();
		if (stundentName.equals("jully")) {
			return 60;
		} else if (stundentName.equals("Lincon")) {
			return 80;
		}else
		{
			System.out.println("Pass correct student name");
			return -1;
		}
	}*/
	
	//write the same above logic, without using multiple return statements
	
	int mark=-1;
	public int getStudentMarks(String stundentName) {
		System.out.println();
		if (stundentName.equals("jully")) {
			mark= 60;
		} else if (stundentName.equals("Lincon")) {
			mark= 80;
		}else
		{
			System.out.println("Pass correct student name");
		
		}
		return mark;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ss = new Student();
		ss.getStudentMarks("hh");
		Student newStudent = new Student();
		int mark = newStudent.getStudentMarks("jully");
		System.out.println(mark+5);
		if(mark>=50) {
			System.out.println(mark);
			System.out.println("A Grade");
		}else if (mark<50) {
			System.out.println("B G rade");
		}else if (mark==-1) {
			System.out.println("Don't generate the marksheet");
		}

	}

}
