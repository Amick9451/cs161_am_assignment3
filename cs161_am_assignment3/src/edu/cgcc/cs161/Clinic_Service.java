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
