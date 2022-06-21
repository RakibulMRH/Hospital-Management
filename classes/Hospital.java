package classes;
import java.lang.*;
import interfaces.*;
import fileio.*;
public class Hospital implements HospitalOperations
{
	protected Ward wards[] = new Ward [250];
	protected ConsultantDoctor consultantDoctors[] = new ConsultantDoctor [100];
	protected JuniorDoctor juniorDoctors[]= new JuniorDoctor[100];
	FileReadWriteDemo frwd = new FileReadWriteDemo ();
	
	public boolean insertWardPatient (Ward w)
	{
		boolean flag = false;
		for (int i=0; i<wards.length; i++)
		{
			if(wards[i] == null)
			{
				wards[i] = w;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	 public boolean releaseWardPatient(Ward w)
	{
		boolean flag = false;
		for(int i = 0; i<wards.length; i++)
		{
			if(wards[i] == w)
			{
				wards[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Ward searchWardPatient(int patientId)
	{
		for (int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{
				if(wards[i].getPatientId() == patientId)
				{
					System.out.println("### Patient Found ###");
					wards[i].showDetails();
					System.out.println();
					return wards[i];
				}
			}
			else
			{
				System.out.println("### Patient not Found ###");
				break;
			}
		}
		return null;
	}
	
	public void showAllPatientDetails()
	{
		System.out.println("All Patients");
		System.out.println("----------------");
		
		for(int i=0; i<wards.length; i++)
		{
			if(wards[i] != null)
			{ 
				
				wards[i].showDetails();
			}
			
		}
		System.out.println("\n----------------\n");
		
	}

	
	public boolean insertConsultantDoctor(ConsultantDoctor c)
	{
		boolean flag = false;
		for (int i=0; i<consultantDoctors.length; i++)
		{
			if(consultantDoctors[i] == null)
			{
				consultantDoctors[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeConsultantDoctor(ConsultantDoctor c)
	{
		boolean flag = false;
		for(int i = 0; i<consultantDoctors.length; i++)
		{
			if(consultantDoctors[i] == c)
			{
				consultantDoctors[i] = null;
				flag = true;
				
				break;
			}
		}
		return flag;
	}
	
	public ConsultantDoctor searchConsultantDoctor(int docId)
	{
		for (int i=0; i<consultantDoctors.length; i++)
		{
			if(consultantDoctors[i] != null)
			{
				if(consultantDoctors[i].getDocId() == docId)
				{
					System.out.println("### Doctor Found ###");
					consultantDoctors[i].showDetails();
					System.out.println();
					return consultantDoctors[i];
				}
			}
			else
			{
				System.out.println("### Doctor not Found ###");
				break;
			}
		}
		return null;
	}
	
	public void showAllConsultantDoctorDetails()
	{
		for(int i=0; i<consultantDoctors.length; i++)
			if(consultantDoctors[i] != null)
			{
				consultantDoctors[i].showDetails();
				System.out.println();
			}
	}
	public boolean insertJuniorDoctor(JuniorDoctor j)
	{
		boolean flag = false;
		for (int i=0; i<juniorDoctors.length; i++)
		{
			if(juniorDoctors[i] == null)
			{
				juniorDoctors[i] = j;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllJuniorDoctorDetails()
	{
		for(int i=0; i<juniorDoctors.length; i++)
			if(juniorDoctors[i] != null)
			{
				juniorDoctors[i].showDetails();
				System.out.println();
			}
	}
	
	
}
