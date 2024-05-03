package OOPSInterface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical{

	
	int min_fee=50;
	//USMedical methods
	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--physioServices");
		}
	@Override
	public void physioServices(int a) {
		
		System.out.println("FH--physioServices:"+a);
	}
	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyServices");
	}

	@Override
	public void detalServices() {
		System.out.println("FH--detalServices");
	}
    ////UKMedical methods
	@Override
	public void gynecServices() {
		System.out.println("FH--gynecServices");
	}

	@Override
	public void gastroServices() {
		System.out.println("FH--gastroServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH--pediaServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH--neuroServices");
		
	}

	public void medicalTraining() {
		System.out.println("FH--medical Training");
	}
	//individual method of Fortishospital
	
	public void pathologyServices() {
		System.out.println("FH--pathologyServices");
	}

	@Override
	public void emergencyServices() {
		
	}
	//Method hiding
	public static void billing()
	{
		System.out.println("US--billing");
	}
//	@Override
	//public void helpDesk()
	//{
		//System.out.println("FH--helpdesk");
	//}
	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH---covidVaccination");
	}
	
	@Override
	public void medicalRND()
	{
		System.out.println("FH medical RND");
	}
}
