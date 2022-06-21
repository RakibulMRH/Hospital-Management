package classes;
import java.lang.*;

public class ICU extends Ward
{
	public int daysSpent;
	public double icuCharge;
	
	public ICU ()
	{
		super();
		this.icuCharge = icuCharge;
	}
	public ICU(int patientId, int wardNum,int patientNum,int patientAge,int bedNum,  int daysSpent,  double icuCharge, String patientName,String patientAddress,String patientGender)
	{
		super(  patientId,  wardNum, patientNum, patientAge, bedNum,   patientName, patientAddress, patientGender);
		this.icuCharge = icuCharge;	
	}
	public void setDaysSpent(int daysSpent)
	{
		this.daysSpent = daysSpent;
	}
	public int getDaysSpent()
	{
		return daysSpent;
	}
	public void setIcuCharge(double icuCharge)
	{
		this.icuCharge = daysSpent*50000;
	}
	public double getIcuCharge()
	{
		return icuCharge;
	}
	public void showDetails()
	{
		System.out.println("*** ICU WARD ***");
		System.out.println("ICU charge " +icuCharge+"TK.\n");
		super.showDetails();
	}
}