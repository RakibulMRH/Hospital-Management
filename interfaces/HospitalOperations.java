package interfaces;
import java.lang.*;
import classes.*;

public interface HospitalOperations
{
	boolean insertWardPatient (Ward w);
	boolean releaseWardPatient(Ward w);
	Ward searchWardPatient(int patientId);
	void showAllPatientDetails();
	boolean insertConsultantDoctor(ConsultantDoctor c);
	boolean removeConsultantDoctor(ConsultantDoctor c);
	ConsultantDoctor searchConsultantDoctor(int docId);
	void showAllConsultantDoctorDetails();
	boolean insertJuniorDoctor(JuniorDoctor j);
	void showAllJuniorDoctorDetails();
	
}