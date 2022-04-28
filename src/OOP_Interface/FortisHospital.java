package OOP_Interface;

public class FortisHospital extends UHNG implements USMedical,UKMedical,IndianMedical {
    //US
	@Override
	public void physioService() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------Physio");
	}

	@Override
	public void cardioService() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------Cardio");
		
	}

	@Override
	public void concologyService() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------Conco");
	}
	
	//Indian

	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------pedia");
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------Dental");
		
	}
    //UK
	@Override
	public void radiologyServices() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------radio");
		
	}

	@Override
	public void entService() {
		// TODO Auto-generated method stub
		System.out.println("FF----------------ent");
		
	}

	@Override
	public void medicalFunds() {
		// TODO Auto-generated method stub
		System.out.println("Medical.... fund");
		
	}

	@Override
	public void covidTest() {
		// TODO Auto-generated method stub
		System.out.println("COVID.... ");
		
	}

	@Override
	public void Vaccrination() {
		// TODO Auto-generated method stub
		System.out.println("Vacination.... ...");
		
	}
	
	public static void report() {
		System.out.println("medical.........report");
	}
	
	@Override
	public void actionsReport() {
		System.out.println("overridden.... actionreport");
	}

	
	
	
}
