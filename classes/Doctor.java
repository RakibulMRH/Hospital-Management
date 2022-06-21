package classes;
import java.lang.*;

public abstract class Doctor
{
	public int docId, docRoomNum, availableDoctors;
	protected String docName;
	
	public Doctor()
	{
		
	}
	public Doctor(int docId, int docRoomNum, String docName)
	{
		
		this.docId=docId;
		this.docRoomNum=docRoomNum;
		this.docName=docName;
		this.availableDoctors=availableDoctors;
	}
	
	public void setDocID(int docId)
	{
		this.docId=docId;
	}
	public void setdocRoomNum(int docRoomNum)
	{
		this.docRoomNum=docRoomNum;
	}
	
	public void setDocName(String docName)
	{
		this.docName=docName;
	}
	
	public int getDocId()
	{
		return this.docId;
	}
	public int getdocRoomNum()
	{
		return this.docRoomNum;
	}
	
	public String getDocName()
	{
		return this.docName;
	}
	
	public void showDetails()
	{
		System.out.println("Doctor's ID: "+this.docId);
		System.out.println("Doctor's Name: "+this.docName);
 		System.out.println("Room Number: "+this.docRoomNum);
		
	}
}