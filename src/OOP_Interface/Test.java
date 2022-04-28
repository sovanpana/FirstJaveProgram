package OOP_Interface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh= new FortisHospital();
		fh.medicalFunds();
		
		USMedical us = new FortisHospital();
		us.medicalFunds();
		WHO.report();
		Medical.report();

		fh.actionsReport();
	}

}
