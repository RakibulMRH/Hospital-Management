package classes;
import java.lang.*;

public class ConsultantDoctor extends Doctor
{
	public String specializedOn;
	public String consultingHours;
	
	public ConsultantDoctor ()
	{
		super();
		this.specializedOn = specializedOn;
	}
	public ConsultantDoctor(int docId, int docRoomNum, String docName,String specializedOn, String consultingHours)
	{
		super(  docId,   docRoomNum,  docName);
		this.specializedOn = specializedOn;
		this.consultingHours = consultingHours;
	}
	public void setSpecializedOn(String specializedOn)
	{
		this.specializedOn = specializedOn;
	}
	public String getSpecializedOn()
	{
		return specializedOn;
	}
	public void consultingHours (String consultingHours)
	{
		this.consultingHours=consultingHours;
	}
	public String getconsultingHours()
	{
		return this.consultingHours;
	}
	public void showDetails()
	{
		System.out.println("*** CONSULTANT DOCTOR ***");
		super.showDetails();
		System.out.println("Specialized On: " +this.specializedOn+"\n");
		System.out.println("Consulting hours: "+this.consultingHours);

	}
}