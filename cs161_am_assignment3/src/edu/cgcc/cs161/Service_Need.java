package edu.cgcc.cs161;

public class Service_Need extends ClinicMain {

	//fields(attributes)
	private String ServiceNeedDescription;
	//Constructor
	Service_Need() {
		ServiceNeedDescription = "Requires Surgerical Referral";
	}
	//operations
	public String identifyNeed() {
		return "Referral required";
	}
	public String MakeAppointment() {
		return "Available dates"; 
	}
	public String MakeReferral() {
		return "Auto generated referral";
	}
	
	public String getServiceNeedDescription() {
		return ServiceNeedDescription;
	}
	
	public void setServiceNeedDescription(String p) {
		ServiceNeedDescription = p;
	}
}
