package interfaceDemo;

public class TestHospital {

	public static void main(String[] args) 
	{
		//Child reference and Child Object
		NobelHS n1=new NobelHS();
		n1.cardio();
		n1.dental();
		n1.medaclService();
		n1.neuro();
		n1.physio();
		n1.covid19T();
		
		//Parent reference and Child Object
		
		IMA i1=new NobelHS();
		i1.cardio();
		i1.dental();
		i1.covid19T();
		
	System.out.println("*********");
	
	USMA u1=new NobelHS();
	u1.neuro();
	u1.physio(); 
	u1.covid19T();
		
		
		

	}

}
