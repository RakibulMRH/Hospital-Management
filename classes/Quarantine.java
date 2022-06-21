package classes;
import java.lang.*;

public class Quarantine extends Ward
{
	public int daysSpent;
	public double quarantineCharge;
	
	public Quarantine ()
	{
		super();
		this.quarantineCharge = quarantineCharge;
	}
	public Quarantine(int patientId, int wardNum,int patientNum,int patientAge,int bedNum,int daysSpent, double quarantineCharge, String patientName,String patientAddress,String patientGender)
	{
		super( patientId,  wardNum, patientNum, patientAge, bedNum , patientName, patientAddress, patientGender);
		this.quarantineCharge = quarantineCharge;	
	}
	public void setDaysSpent(int daysSpent)
	{
		this.daysSpent = daysSpent;
	}
	public int getDaysSpent()
	{
		return daysSpent;
	}
	public void setQuarantineCharge(double quarantineCharge)
	{
		this.quarantineCharge = getDaysSpent()*500;
	}
	public double getQuarantineCharge()
	{
		return this.quarantineCharge;
	}
	public void showDetails()
	{
		System.out.println("*** QUARANTINE WARD ***");
		System.out.println("QUARANTINE charge " +quarantineCharge+"TK.\n");
		
	}
}