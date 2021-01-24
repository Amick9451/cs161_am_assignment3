package edu.cgcc.cs161;

public class Referral extends ClinicMain{

	//fields(attributes)
	
	private String providerName;
	private String date;
	private String time;
	
	//Constructor
	Referral() {
		providerName = "Vancouver Clinic";
		date = "1/23/21";
		time = "12:11";
	}
	//operations
	
	public String getproviderName() {  //getter
		return providerName;
	}
	
	public void setproviderName(String p) {
		providerName = p;
	}
}
