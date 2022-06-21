package classes;
import java.lang.*;

public class Observation extends Ward
{
	public int daysSpent;
	public double observationCharge;
	
	public Observation ()
	{
		super();
		this.observationCharge = observationCharge;
	}
	public Observation(int patientId, int wardNum,int patientNum,int patientAge,int bedNum, int daysSpent,double observationCharge, String patientName,String patientAddress,String patientGender)
	{
		super( patientId,  wardNum, patientNum, patientAge, bedNum , patientName, patientAddress, patientGender);
		this.observationCharge = observationCharge;	
	}
	public void setDaysSpent(int daysSpent)
	{
		this.daysSpent = daysSpent;
	}
	public int getDaysSpent()
	{
		return daysSpent;
	}
	public void setObservationCharge(double observationCharge)
	{
		this.observationCharge = daysSpent*500;
	}
	public double getObservationCharge()
	{
		return this.observationCharge;
	}
	public void showDetails()
	{
		System.out.println("*** OBSERVATION WARD ***");
		System.out.println("Observation Charge " +observationCharge+"\n");
		super.showDetails();
	}
}