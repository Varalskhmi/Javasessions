package OOPSInterface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.physioServices();
		fh.physioServices(10);
		fh.detalServices();
		fh.gastroServices();
		fh.emergencyServices();
		fh.gastroServices();
		
		fh.emergencyServices();
		System.out.println(USMedical.MIN_FEE);
		System.out.println(fh.min_fee);
		USMedical.billing();
		FortisHospital.billing();
		fh.helpDesk();
		fh.covidVaccination();
		
		fh.medicalNews();
		fh.medicalRND();
		
		//top casting --child class object can be referred by parent Interface-reference variable
	USMedical us=new FortisHospital();
	us.detalServices();
	us.oncologyServices();
	us.physioServices();
	us.emergencyServices();
	//us.physioServices(0);
	}

}
