package classes;
import java.lang.*;

public class Ward
{
	protected int wardNum, patientId, patientNum, patientAge, bedNum ;
	protected String patientName, patientAddress, patientGender;
	
	public Ward()
	{
		
	}
	public Ward(int patientId, int wardNum,int patientNum,int patientAge,int bedNum, String patientName,String patientAddress,String patientGender)
	{
		
		this.patientId = patientId;
		this.wardNum = wardNum;
		this.patientNum = patientNum;
		this.patientAge = patientAge;
		this.bedNum = bedNum;
		
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientGender = patientGender;	
	}
	public void setPatientId (int patientId)
	{
		this.patientId = patientId;
	}
	public void setWardNum(int wardNum)
	{
		this.wardNum = wardNum;
	}
	public void setPatientAge(int patientAge)
	{
		this.patientAge = patientAge;
	}
	public void setPatientNum(int patientNum)
	{
		this.patientNum = patientNum;
	}
	public void setBedNum(int bedNum)
	{
		this.bedNum = bedNum;
	}	
	
	public void setPatientName(String patientName)
	{
		this.patientName = patientName;
	}
	public void setPatientAddress(String patientAddress)
	{
		this.patientAddress = patientAddress;
	}
	public void setPatientGender(String patientGender)
	{
		this.patientGender = patientGender;
	}
	
	public int getPatientId()
	{
		return this.patientId;
	}
	public int getWardNum()
	{
		return this.wardNum;
	}
	public int getPatientAge()
	{
		return this.patientAge;
	}
	public int getPatientNum()
	{
		return this.patientNum;
	}
	public int getBedNum()
	{
		return this.bedNum;
	}
	

	public String getPatientName()
	{
		return this.patientName;
	}
	public String getPatientAddress()
	{
		return this.patientAddress;
	}
	public String getPatientGender()
	{
		return this.patientGender;
	}
	
	
	public void showDetails()
	{
		System.out.println();
		System.out.println("Patient ID: "+this.patientId);
		if( this.wardNum <= 40){System.out.println("Patient's Ward: ICU");}
		else if (this.wardNum >=41 && this.wardNum <=99) {System.out.println("Patient's Ward: Observation");}
		else if (this.wardNum >=100&& this.wardNum <=200) {System.out.println("Patient's Ward: General");}
		else if (this.wardNum >=201 && this.wardNum <=250) {System.out.println("Patient's Ward: Quarantine");}
		System.out.println("Patient's Room: "+this.wardNum);
		System.out.println("Bed Number: "+this.bedNum);
		 
		System.out.println("Patient Name: "+this.patientName);
		System.out.println("Patient Gender: "+this.patientGender);
		System.out.println("Age: "+this.patientAge);
		System.out.println("Parmanent Address: "+this.patientAddress);
		System.out.println("Contact Number: "+this.patientNum);
		
	}
}