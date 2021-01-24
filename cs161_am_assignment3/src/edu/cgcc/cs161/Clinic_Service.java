//HEADER
//Program Name: Assignment3_Clinic_Service
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Clinic_Service class for ClinicMain based off of use case diagram. Framework only. 

//PSUEDOCODE
//Program Start
//create ServiceNumber attribute
//create ServiceName attribute
//create ServiceDescription attribute 
//Create constructor
//assign ServiceNumber to int 13
//assign ServiceName to String "referral"
//assign ServiceDescription to "auto-generated referral"
//create getServiceName accessor
//assign getServiceName to return ServiceName
//create setServiceName 
//assign setServiceName u to ServiceName
//End Program

package edu.cgcc.cs161;

public class Clinic_Service extends ClinicMain {

	//fields(attributes)
	private int ServiceNumber;
	private String ServiceName;
	private String ServiceDescription;
	

	//Constructor
Clinic_Service() {
	ServiceNumber=13;
	ServiceName = "Referral";
	ServiceDescription = "Auto-generated referral";
}
	//operations
	public String getServiceName() {
		return ServiceName;
	}
	
	public void setServiceName(String u) {
		ServiceName = u;
	}
}
//FOOTER
//N/A