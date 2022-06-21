import java.lang.*;
import classes.*;
import java.util.Scanner;
import fileio.*;

public class Start
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Hospital h = new Hospital();
		FileReadWriteDemo frwd = new FileReadWriteDemo ();
		ICU icu = new ICU();
		Observation ob = new Observation();
		General gen = new General();
		Quarantine qt = new Quarantine();
		
		System.out.println("-------------------------------------------");
		System.out.println("            DHAKA GENERAL HOSPITAL          ");
		System.out.println("-------------------------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Ward Management");
			System.out.println("\t2. Doctors");
			System.out.println("\t3. View Recent Activites");
			System.out.println("\t4. Exit");
			
			System.out.println();
			System.out.print("What is your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chosen Ward Management");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("Select Ward Type: ");
					System.out.println("\t1. OBSERVATION");
					System.out.println("\t2. ICU");
					System.out.println("\t3. QUARANTINE");
					System.out.println("\t4. GENERAL ");
					System.out.println("\t5. Go Back");
					
					
					System.out.println();
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("**** OBSERVATION WARD **** ");
							System.out.println("-------------------------------------------");
							
							
							System.out.println();
							System.out.println("Select Ward Type: ");
							System.out.println("\t1. Add New patient");
							System.out.println("\t2. Release Patient");
							System.out.println("\t3. Search Patient");
							System.out.println("\t4. Show Patients");
							System.out.println("\t5. Go Back");
					
							System.out.println();
							System.out.print("Enter your option: ");
							int option1a = sc.nextInt();
							
							switch(option1a)
							{
								case 1:
									System.out.println("---------------------------------------------------------");
									System.out.println("You have chosen to add a New Patient in OBSERVATION WARD \n Room Number 41-99");
									System.out.println("---------------------------------------------------------");
				
									System.out.print("Enter Patient ID: ");
									int patientId1 = sc.nextInt();
									System.out.print("Enter room number: ");
									int wardNum1 = sc.nextInt();
									System.out.print("Enter Bed Number: ");
									int bedNum1 = sc.nextInt();
									System.out.print("Enter Patient Name: ");
									String patientName1 = sc.next();
									System.out.print("Enter Patient Gender: ");
									String patientGender1 = sc.next();
									
									System.out.print("Enter Patient Age: ");
									int patientAge1 = sc.nextInt();
									System.out.print("Enter Patient Address: ");
									String patientAddress1 = sc.next();
									System.out.print("Enter Patient's Contact Number: ");
									int patientNum1 = sc.nextInt();
									
									if(wardNum1 >=41 && wardNum1 <=99)
									{
										Ward w1 = new Ward(patientId1, wardNum1, patientNum1, patientAge1, bedNum1, patientName1, patientAddress1, patientGender1);
										h.insertWardPatient(w1);
										
											System.out.println("Patient " + w1.getPatientId() + " has been Inserted\n");
										
									}
									else
									{
									System.out.println("\nInvalid Room Number\n ");
									}
									break;
								case 2:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to release a Patient");
									System.out.println("-------------------------------------------");
									
									System.out.println("Enter Patient ID: ");
									int patientId22 = sc.nextInt();
									
									Ward w22 = h.searchWardPatient(patientId22);
									if(w22 != null)
									{
										System.out.println("### Patient Found for releasing ###");
										if(h.releaseWardPatient(w22))
										{
											System.out.println("Patient " + w22.getPatientId() + " has been released");
											frwd.writeInFile("Patient "+w22.getPatientId()+ " has been released");
										}
									}
									else
									{
										System.out.println("### Patient NOT Found and Can not be released ###");
									}
									System.out.println();
									break;
									
								case 3:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Search a Patient");
									System.out.println("-------------------------------------------");	
									
									System.out.print("Enter Patient ID for searching: ");
									int patientId3 = sc.nextInt();
									
									 h.searchWardPatient(patientId3);
									 
									break;
									
								case 4: 
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Show all Patients");
									System.out.println("-------------------------------------------");
									
									h.showAllPatientDetails();
								    break;	
								case 5:
						
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Go Back");
									System.out.println("-------------------------------------------");
									break;
							
								default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;	
							}
					
				break;
				case 2:
	
						    System.out.println("-------------------------------------------");
							System.out.println("**** ICU WARD **** ");
							System.out.println("-------------------------------------------");
							
							
							System.out.println();
							System.out.println("Select Ward Type: ");
							System.out.println("\t1. Add New patient");
							System.out.println("\t2. Release Patient");
							System.out.println("\t3. Search Patient");
							System.out.println("\t4. Show Patients");
							System.out.println("\t5. Go Back");
					
							System.out.println();
							System.out.print("Enter your option: ");
							int option2a = sc.nextInt();
					
					
							switch(option2a)
							{
								case 1:
									System.out.println("------------------------------------------------");
									System.out.println("You have chosen to add a New Patient in ICU WARD \n Room Number 1-40");
									System.out.println("------------------------------------------------");
				
									System.out.print("Enter Patient ID: ");
									int patientId6 = sc.nextInt();
									System.out.print("Enter room number: ");
									int wardNum2 = sc.nextInt();
									System.out.print("Enter Bed Number: ");
									int bedNum2 = sc.nextInt();
									System.out.print("Enter Patient Name: ");
									String patientName2 = sc.next();
									System.out.print("Enter Patient Gender: ");
									String patientGender2 = sc.next();
									System.out.print("Enter Patient Age: ");
									int patientAge2 = sc.nextInt();
									System.out.print("Enter Patient Address: ");
									String patientAddress2 = sc.next();
									System.out.print("Enter Patient's Contact Number: ");
									int patientNum2 = sc.nextInt();
									
									if(wardNum2 <= 40)
									{
										Ward w2 = new Ward(patientId6, wardNum2, patientNum2, patientAge2, bedNum2, patientName2, patientAddress2, patientGender2);
										h.insertWardPatient(w2);
											System.out.println("Patient " + w2.getPatientId() + " has been Inserted\n");
										
											
									}
									else
									{
									System.out.println("\nInvalid Room Number\n ");
									}
									break;
								
								case 2:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to release a Patient");
									System.out.println("-------------------------------------------");
									
									System.out.println("Enter Patient ID: ");
									int patientId23 = sc.nextInt();
									
									Ward w23 = h.searchWardPatient(patientId23);
									if(w23 != null)
									{
										System.out.println("### Patient Found for releasing ###");
										if(h.releaseWardPatient(w23))
										{
											System.out.println("Patient " + w23.getPatientId() + " has been released");
											frwd.writeInFile("Patient "+w23.getPatientId()+ " has been released");
										}
									}
									else
									{
										System.out.println("### Patient NOT Found and Can not be released ###");
									}
									System.out.println();
									break;
									
								case 3:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Search a Patient");
									System.out.println("-------------------------------------------");	
									System.out.print("Enter Patient ID for searching: ");
									int patientId5 = sc.nextInt();
									
									h.searchWardPatient(patientId5);
									
									System.out.println();
									break;
									
								case 4: 
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Show all Patients");
									System.out.println("-------------------------------------------");
									
									h.showAllPatientDetails();
								    break;	
								case 5:
						
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Go Back");
									System.out.println("-------------------------------------------");
									break;
							
								default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;	
							}
					
					break;
					case 3:
	
						    System.out.println("-------------------------------------------");
							System.out.println("**** QUARANTINE WARD **** ");
							System.out.println("-------------------------------------------");
							
							
							System.out.println();
							System.out.println("Select Ward Type: ");
							System.out.println("\t1. Add New patient");
							System.out.println("\t2. Release Patient");
							System.out.println("\t3. Search Patient");
							System.out.println("\t4. Show Patients");
							System.out.println("\t5. Go Back");
					
							System.out.println();
							System.out.print("Enter your option: ");
							int option3a = sc.nextInt();
					
					
							switch(option3a)
							{
								case 1:
									System.out.println("--------------------------------------------------------");
									System.out.println("You have chosen to add a New Patient in QUARANTINE WARD \n Room Number 201-250");
									System.out.println("--------------------------------------------------------");
				
									System.out.print("Enter Patient ID: ");
									int patientId7 = sc.nextInt();
									System.out.print("Enter room number: ");
									int wardNum3 = sc.nextInt();
									System.out.print("Enter Bed Number: ");
									int bedNum3 = sc.nextInt();
									System.out.print("Enter Patient Name: ");
									String patientName3 = sc.next();
									System.out.print("Enter Patient Gender: ");
									String patientGender3 = sc.next();
									System.out.print("Enter Patient Age: ");
									int patientAge3 = sc.nextInt();
									System.out.print("Enter Patient Address: ");
									String patientAddress3 = sc.next();
									System.out.print("Enter Patient's Contact Number: ");
									int patientNum3 = sc.nextInt();
									
									if(wardNum3 >=201 && wardNum3 <=250)
									{
										Ward w3 = new Ward(patientId7, wardNum3, patientNum3, patientAge3, bedNum3, patientName3, patientAddress3, patientGender3);
										h.insertWardPatient(w3);
										
											System.out.println("Patient " + w3.getPatientId() + " has been Inserted\n");
										
									}
									else
									{
									System.out.println("\nInvalid Room Number\n ");
									}
									break;
								
								case 2:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to release a Patient");
									System.out.println("-------------------------------------------");
									
									System.out.println("Enter Patient ID: ");
									int patientId24 = sc.nextInt();
									
									Ward w24 = h.searchWardPatient(patientId24);
									if(w24 != null)
									{
										System.out.println("### Patient Found for releasing ###");
										if(h.releaseWardPatient(w24))
										{
											System.out.println("Patient " + w24.getPatientId() + " has been released");
											frwd.writeInFile("Patient "+w24.getPatientId()+ " has been released");
										}
									}
									else
									{
										System.out.println("### Patient NOT Found and Can not be released ###");
									}
									System.out.println();
									break;
									
								case 3:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Search a Patient");
									System.out.println("-------------------------------------------");	
									
									System.out.print("Enter Patient ID for searching: ");
									int patientId9 = sc.nextInt();
									
									h.searchWardPatient(patientId9);
									
									System.out.println();
									break;
									
								case 4: 
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Show all Patients");
									System.out.println("-------------------------------------------");
									
									h.showAllPatientDetails();
								    break;	
								case 5:
						
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Go Back");
									System.out.println("-------------------------------------------");
									break;
							
								default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;	
							}
					break;
					case 4:
	
						    System.out.println("-------------------------------------------");
							System.out.println("**** GENERAL WARD **** ");
							System.out.println("-------------------------------------------");
							
							
							System.out.println();
							System.out.println("Select Ward Type: ");
							System.out.println("\t1. Add New patient");
							System.out.println("\t2. Release Patient");
							System.out.println("\t3. Search Patient");
							System.out.println("\t4. Show Patients");
							System.out.println("\t5. Go Back");
					
							System.out.println();
							System.out.print("Enter your option: ");
							int option4a = sc.nextInt();
					
					
							switch(option4a)
							{
								case 1:
									System.out.println("-----------------------------------------------------");
									System.out.println("You have chosen to add a New Patient in GENERAL WARD \n Room Number 100-200");
									System.out.println("-----------------------------------------------------");
								
									System.out.print("Enter Patient ID: ");
									int patientId10 = sc.nextInt();
									System.out.print("Enter room number: ");
									int wardNum4 = sc.nextInt();
									System.out.print("Enter Bed Number: ");
									int bedNum4 = sc.nextInt();
									System.out.print("Enter Patient Name: ");
									String patientName4 = sc.next();
									System.out.print("Enter Patient Gender: ");
									String patientGender4 = sc.next();
									System.out.print("Enter Patient Age: ");
									int patientAge4 = sc.nextInt();
									System.out.print("Enter Patient Address: ");
									String patientAddress4 = sc.next();
									System.out.print("Enter Patient's Contact Number: ");
									int patientNum4 = sc.nextInt();
									
									if(wardNum4 >=100 && wardNum4 <=200 )
									{
										Ward w4 = new Ward(patientId10, wardNum4, patientNum4, patientAge4, bedNum4, patientName4, patientAddress4, patientGender4);
										if(w4 != null) {
										h.insertWardPatient(w4);}
										
											System.out.println("Patient " + w4.getPatientId() + " has been Inserted\n");
										
									}
									else
									{
									System.out.print("\n\nInvalid Room Number\n ");
									}
									break;
								
								case 2:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to release a Patient");
									System.out.println("-------------------------------------------");
									
									System.out.println("Enter Patient ID: ");
									int patientId26 = sc.nextInt();
									
									Ward w26 = h.searchWardPatient(patientId26);
									if(w26 != null)
									{
										System.out.println("### Patient Found for releasing ###");
										if(h.releaseWardPatient(w26))
										{
											System.out.println("Patient " + w26.getPatientId() + " has been released");
											frwd.writeInFile("Patient "+w26.getPatientId()+ " has been released");
										}
									}
									else
									{
										System.out.println("### Patient NOT Found and Can not be released ###");
									}
									System.out.println();
									break;
									
								case 3:
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Search a Patient");
									System.out.println("-------------------------------------------");	
									
									System.out.print("Enter Patient ID for searching: ");
									int patientId12 = sc.nextInt();
									
									h.searchWardPatient(patientId12);
									
									System.out.println();
									break;
									
								case 4: 
									
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Show all Patients");
									System.out.println("-------------------------------------------");
									
									h.showAllPatientDetails();
								    break;	
								case 5:
						
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Go Back");
									System.out.println("-------------------------------------------");
									break;
							
								default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;	
							}
						case 5:
						
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Go Back");
									System.out.println("-------------------------------------------");
									break;
							
						default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;					
					}
				break;
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("**** DOCTOR MANAGEMENT AND INFORMATIONS ******");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("Select Doctor Type: ");
					System.out.println("\t1. CONSULTANT");
					System.out.println("\t2. JUNIOR");
					System.out.println("\t3. Go Back");
					
					System.out.println();
					System.out.print("Enter your option: ");
					int optionL = sc.nextInt();
					
					switch(optionL)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("**** CONSULTANT DOCTORS **** ");
							System.out.println("-------------------------------------------");
							System.out.println("\t1. Add a new Doctor");
							System.out.println("\t2. Remove a Doctor");
							System.out.println("\t3. Search Doctor");
							System.out.println("\t4. Show Consultant Doctors");
							System.out.println("\t5. Go Back");
							
							System.out.println();
							System.out.print("Enter your option: ");
							int optionLa = sc.nextInt();
							switch(optionLa)
							{
								case 1:
								System.out.println("-------------------------------------------");
								System.out.println("You have chosen to Add a new Doctor");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter new Doctor ID: ");
								int docId1 = sc.nextInt();
								System.out.print("Enter visiting room number: ");
								int docRoomNum1 = sc.nextInt();
								
								System.out.print("Enter Doctor's Name: ");
								String docName1 = sc.next();
								System.out.print("The Doctor is specialized on:");
								String specializedOn1 = sc.next();
								System.out.print("Enter Doctor's Consulting hours:");
								String consultingHours1 = sc.next();
								
								if(docRoomNum1 <= 250)
									{
										ConsultantDoctor c1 = new ConsultantDoctor( docId1,  docRoomNum1,  docName1, specializedOn1,  consultingHours1);
										h.insertConsultantDoctor(c1);
											System.out.println("Doctor " + c1.getDocName() + " has been Inserted\n");
											frwd.writeInFile("Doctor " + c1.getDocName() + " has been added");
										
									}
									
									break;
								case 2:
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to remove Doctor");
									System.out.println("-------------------------------------------");
									
									System.out.println("Enter Doctor's ID: ");
									
									int docId2 = sc.nextInt();
									
									ConsultantDoctor c2 = h.searchConsultantDoctor(docId2);
									if(c2 != null)
									{
										System.out.println("### Doctor Found for removing ###");
										if(h.removeConsultantDoctor(c2))
										{
											System.out.println("Doctor " + c2.getDocId() + " has been removed");
											frwd.writeInFile("Doctor " + c2.getDocName() + " has been removed");
										}
									}
									else
									{
										System.out.println("### Doctor not found and Cannot be removed ###");
									}
									System.out.println();
									break;
								case 3:
								
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Search a Doctor");
									System.out.println("-------------------------------------------");	
									
									System.out.print("Enter Doctor's ID for searching: ");
									int docId3 = sc.nextInt();
									
									ConsultantDoctor c3 = h.searchConsultantDoctor(docId3);
									if(c3 != null)
									{
										System.out.println("### Doctor not Found ###");
										System.out.println("Doctor's ID: "+c3.getDocId());
										System.out.println("Chember number: "+c3.docRoomNum);
										System.out.println("Doctor's Name: "+c3.getDocName());
										
										System.out.println("Specialized On: "+c3.getSpecializedOn());
										System.out.println("Consulting Hour: "+c3.getconsultingHours());
									}
									else
									{
										System.out.println("### Doctor not Found ###");
										
									}
									System.out.println();
									break;
									
								case 4:
									System.out.println("-------------------------------------------");
									System.out.println("**** CONSULTANT DOCTORS **** ");
									System.out.println("-------------------------------------------");
							
									ConsultantDoctor c4 = new ConsultantDoctor  (1111,  45, "Dr.Nawshin Nasir ", "Urologists","8.00 AM-10.00AM");
                                    ConsultantDoctor c5 = new ConsultantDoctor  (2222,  46, "Dr. Shabab kabir ", "Cardiologists","10.00 AM-12.00 PM");
                                    ConsultantDoctor c6 = new ConsultantDoctor  (3333,  47,"Dr.Rakibul " ,"Endocrinologists","1.00 PM-3.00 PM");
                                    ConsultantDoctor c7 = new ConsultantDoctor  (4444,  48, "Dr.Hasan", " Nephrologists","4.00 PM-6.00 PM");
                                    ConsultantDoctor c8 = new ConsultantDoctor  (5551,  49,"Dr Kistry" ,"Otolaryngologists","7.00 AM-9.00 PM");
                                    ConsultantDoctor c9 = new ConsultantDoctor  (5552,  50, "Dr Valentine","Oncologists","10.00 AM-12.00 AM");
                                    ConsultantDoctor c10 = new ConsultantDoctor (6666,  51, "Dr Tanner", "Radiologists","1.00 AM-2.00 AM");
                                    ConsultantDoctor c11 = new ConsultantDoctor (6661,  52, "Dr Pitts" ,"Rheumatologists","3.00 AM-4.00 AM");
                                    ConsultantDoctor c12 = new ConsultantDoctor (6662,  53, "Dr Skinner", "Orthopedic surgeons","5.00 AM-6.00 AM");
                                    ConsultantDoctor c13 = new ConsultantDoctor (7771,  54, "Dr Johnathan", "Anesthesiologists","6.00 AM-7.00 AM");
                                    ConsultantDoctor c14 = new ConsultantDoctor (7772,  55, "Dr Pain" ,"Dermatologists","7.00 AM-8.00 PM");
							
									h.insertConsultantDoctor (c4);
									h.insertConsultantDoctor (c5);
									h.insertConsultantDoctor (c6);
									h.insertConsultantDoctor (c7);
									h.insertConsultantDoctor (c8);
									h.insertConsultantDoctor (c9);
									h.insertConsultantDoctor (c10);
									h.insertConsultantDoctor (c11);
									h.insertConsultantDoctor (c12);
									h.insertConsultantDoctor (c13);
									h.insertConsultantDoctor (c14);
									h.showAllConsultantDoctorDetails();	
									
									System.out.println();
									break;
								case 5:
						
									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Go Back");
									System.out.println("-------------------------------------------");
									break;
							
								default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;	
										
							}
						break;
						case 2:
							
								System.out.println("-------------------------------------------");
								System.out.println("**** JUNIOR DOCTORS **** ");
								System.out.println("-------------------------------------------");
								
								JuniorDoctor j1 = new JuniorDoctor (2111,  "0146532646",45, " Dr.Nasir ", "331");
								JuniorDoctor j2 = new JuniorDoctor (3222,  "0157578778", 46, "Dr.kabir ", "332");
								JuniorDoctor j3 = new JuniorDoctor (4111,  "0197732741",45,"Dr.Rakib ", "334");
								JuniorDoctor j4 = new JuniorDoctor (5111,  "0186592646",45, "Dr.Hasibul", "335");
								JuniorDoctor j5 = new JuniorDoctor (6111,  "01765320643", 45,"Dr.Rojin","336");
								JuniorDoctor j6 = new JuniorDoctor (7111,  "0196538948",45, "Dr Bappi","338");
								JuniorDoctor j7 = new JuniorDoctor (8111,  "0163532640",45, " Dr sc sonjoy", "339");
							
								h.insertJuniorDoctor(j1);
								h.insertJuniorDoctor(j2);
								h.insertJuniorDoctor(j3);
								h.insertJuniorDoctor(j4);
								h.insertJuniorDoctor(j5);
								h.insertJuniorDoctor(j6);
								h.insertJuniorDoctor(j7);
								h.showAllJuniorDoctorDetails();
								break;
					}
					break;
						case 3:

									System.out.println("-------------------------------------------");
									System.out.println("Recent Activites(if done)");
									System.out.println("-------------------------------------------");
									frwd.readFromFile();
									break;
						case 4:

									System.out.println("-------------------------------------------");
									System.out.println("You have chosen to Exit");
									System.out.println("-------------------------------------------");
									repeat = false;
					
									break;
									
									
						default:
						
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
									break;	
								
							
					
							
							
							
					
			}
		
			
			
		}
	}
}

	