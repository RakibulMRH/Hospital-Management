package classes;
import java.lang.*;

public class General extends Ward
{
	public int daysSpent;
	public double generalCharge;
	
	public General ()
	{
		super();
		this.generalCharge = generalCharge;
	}
	public General(int patientId, int wardNum,int patientNum,int patientAge,int bedNum, int daysSpent,double generalCharge, String patientName,String patientAddress,String patientGender)
	{
		super( patientId,  wardNum, patientNum, patientAge, bedNum,  patientName, patientAddress, patientGender);
		this.generalCharge = generalCharge;	
	}
	public void setDaysSpent(int daysSpent)
	{
		this.daysSpent = daysSpent;
	}
	public int getDaysSpent()
	{
		return daysSpent;
	}
	public void setGeneralCharge(double generalCharge)
	{
		this.generalCharge = daysSpent*500;
	}
	public double getGeneralCharge()
	{
		return generalCharge;
	}
	public void showDetails()
	{
		System.out.println("*** General WARD ***");
		System.out.println("GENERAL charge " +generalCharge+"TK.\n");
		super.showDetails();
	}
}