package classes;
import java.lang.*;

public class JuniorDoctor extends Doctor
{
	public String numOfWards;
	
	public JuniorDoctor ()
	{
		super();
		this.numOfWards = numOfWards;
	}
	public JuniorDoctor(int docId, String docNum, int docRoomNum, String docName,String numOfWards )
	{
		super(  docId  ,   docRoomNum,   docName);
		this.numOfWards = numOfWards;
 	}
	public void setNumOfWards(String numOfWards)
	{
		this.numOfWards = numOfWards;
	}
	public String getNumOfWards()
	{
		return this.numOfWards;
	}
	public void showDetails()
	{
		System.out.println("*** JUNIOR DOCTORS ***");
		super.showDetails();
		System.out.println("Available in Ward no: "+this.numOfWards);
	}
}